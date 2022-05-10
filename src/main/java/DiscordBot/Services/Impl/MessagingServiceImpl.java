package DiscordBot.Services.Impl;

import DiscordBot.Services.MessagingService;
import DiscordBot.listener.DeleteReactionListener;
import DiscordBot.listener.impl.DeleteReactionListenerImpl;
import org.javacord.api.entity.channel.TextChannel;
import org.javacord.api.entity.message.Message;
import org.javacord.api.entity.message.MessageAuthor;
import org.javacord.api.entity.message.MessageBuilder;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import java.awt.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;


public class MessagingServiceImpl implements MessagingService {

    DeleteReactionListenerImpl deleteReactionListener = new DeleteReactionListenerImpl();

    @Override
    public CompletableFuture<Message> sendMessage(MessageAuthor author, String title, String description, String footer, String thumbnail, TextChannel channel) {

        int red = (int) Math.floor(Math.random() * 255);
        int green = (int) Math.floor(Math.random() * 255);
        int blue = (int) Math.floor(Math.random() * 255);

        return new MessageBuilder().setEmbed(new EmbedBuilder()
                .setAuthor(author)
                .setTitle(title)
                .setDescription(description)
                .setFooter(footer)
                .setThumbnail(thumbnail)
                .setColor(new Color(red, green, blue)))
                .send(channel);
    }

    @Override
    public void sendMessage(MessageAuthor author, String title, String description, String footer, String thumbnail, TextChannel textChannel, boolean withDelete) {
        this.sendMessage(author,title,description,footer,thumbnail,textChannel)
                .thenAccept(message -> message.addReactionAddListener(deleteReactionListener)
                        .removeAfter(30, TimeUnit.SECONDS));
    }
}
