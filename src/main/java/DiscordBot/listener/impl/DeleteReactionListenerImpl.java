package DiscordBot.listener.impl;

import DiscordBot.listener.DeleteReactionListener;
import org.javacord.api.event.message.reaction.ReactionAddEvent;

public class DeleteReactionListenerImpl implements DeleteReactionListener {
    @Override
    public void onReactionAdd(ReactionAddEvent reactionAddEvent) {
        if(reactionAddEvent.getEmoji().equalsEmoji("\uD83D\uDC4E")) {
            reactionAddEvent.deleteMessage();
        };
    }
}
