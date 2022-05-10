package DiscordBot.listener.impl;

import DiscordBot.Services.Impl.MessagingServiceImpl;
import DiscordBot.listener.PingListener;
import org.javacord.api.event.message.MessageCreateEvent;

public class PingListenerImpl implements PingListener {

    MessagingServiceImpl messagingService = new MessagingServiceImpl();

    @Override
    public void onMessageCreate(MessageCreateEvent messageCreateEvent) {

        if (messageCreateEvent.getMessageContent().equalsIgnoreCase("!ping")) {
                messagingService.sendMessage(
                        messageCreateEvent.getMessageAuthor(),
                        "Ping!",
                        "Ping!",
                        "Ping!",
                        "https://upload.wikimedia.org/wikipedia/commons/c/ca/Osama_bin_Laden_portrait.jpg",
                        messageCreateEvent.getChannel() ,
                        true);
        }
        /*
        if (messageCreateEvent.getMessageContent().equalsIgnoreCase("!ping")){
            messageCreateEvent.getChannel().sendMessage("Pong!");
        }
         */
    }
}
