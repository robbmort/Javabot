package DiscordBot.listener.impl;

import DiscordBot.listener.HelpListener;
import org.javacord.api.event.message.MessageCreateEvent;

public class HelpListenerImpl implements HelpListener {

    @Override
    public void onMessageCreate(MessageCreateEvent messageCreateEvent) {
        if(messageCreateEvent.getMessageContent().equalsIgnoreCase("!help")){
            messageCreateEvent.getChannel().sendMessage("The commands are: \n \n !help - Provides list of commands \n !ping - Pong! \n !rate -Type !rate [word] for a rating\n !gay - Gay");
        }
    }
}
