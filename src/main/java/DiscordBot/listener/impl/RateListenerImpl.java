package DiscordBot.listener.impl;

import DiscordBot.Services.Impl.MessagingServiceImpl;
import DiscordBot.listener.RateListener;
import org.javacord.api.event.message.MessageCreateEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RateListenerImpl implements RateListener {

    MessagingServiceImpl messagingService = new MessagingServiceImpl();

    private final static Pattern pattern = Pattern.compile("!rate (\\w+)");

    @Override
    public void onMessageCreate(MessageCreateEvent messageCreateEvent) {
        if (messageCreateEvent.getMessageContent().startsWith("!rate")) {
            Matcher matcher = pattern.matcher(messageCreateEvent.getMessageContent());
            if (matcher.matches()) {

                //Rates the word

                int rating = (int) Math.floor(Math.random() * 100) + 1;
                messagingService.sendMessage(messageCreateEvent.getMessageAuthor(),
                        "Rate Calculator",
                        messageCreateEvent.getMessageAuthor().getDisplayName() + " is " + rating + "% " + matcher.group(1),
                        "Rate again?",
                        "https://upload.wikimedia.org/wikipedia/commons/c/ca/Osama_bin_Laden_portrait.jpg",
                        messageCreateEvent.getChannel() ,
                        true);
            }else{
                messagingService.sendMessage(messageCreateEvent.getMessageAuthor(),
                "Rate Calculator",
                "Use the correct format dumbass, !rate [word]",
                "Try again",
                null,
                messageCreateEvent.getChannel());


                //Old way of doing code. Using faster way now :)

                /*
                int red = (int) Math.floor(Math.random() * 255);
                int green = (int) Math.floor(Math.random() * 255);
                int blue = (int) Math.floor(Math.random() * 255);

                new MessageBuilder().setEmbed(new EmbedBuilder()
                        .setAuthor(messageCreateEvent.getMessageAuthor())
                        .setTitle("Rate Calculator")
                        .setDescription()
                        .setFooter("Rate again?")
                        .setThumbnail("")
                        .setColor(new Color(red, green, blue)))
                        .send(messageCreateEvent.getChannel());
            } else {
                //Corrects syntax
                messageCreateEvent.getChannel()
                        .sendMessage("Use the correct format dumbass, !rate [word]");
                */
            }
        }
    }
}
