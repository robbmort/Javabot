package DiscordBot.listener.impl;

import DiscordBot.listener.GayListener;
import org.javacord.api.event.message.MessageCreateEvent;

public class GayListenerImpl implements GayListener {

    @Override
    public void onMessageCreate(MessageCreateEvent messageCreateEvent) {

        String gay[] = {"https://c.tenor.com/933m6-1O0i8AAAAC/cum-sex.gif",
                "https://c.tenor.com/9hRdtVSEjgAAAAAC/starry-kissing-starry.gif",
                "https://c.tenor.com/ANMQKZwDxIkAAAAC/love-is-love-sexytime.gif",
                "https://c.tenor.com/BmYL_ED2LbsAAAAC/gay-kissing.gif",
                "https://c.tenor.com/KW7rLBA6t6YAAAAC/gay-kiss.gif",
                "https://c.tenor.com/jXs6t8Q8k54AAAAC/kiss-make-out.gif",
                "https://c.tenor.com/oKTiFpu0FEEAAAAC/gay-kiss.gif",
                "https://c.tenor.com/wANmca86o1kAAAAd/petekao-dark-blue-kiss.gif",
                "https://c.tenor.com/wcAqxfv6TTwAAAAC/gay-kiss-kiss.gif",
                "https://tenor.com/view/dane-de-haan-gay-daniel-radcliffe-gay-kiss-gabriel-austin-gif-5657040",
                "https://thumb-p0.xhcdn.com/a/KOHtorcew4Bq_xRHwkUdAw/000/477/357/370_450.gif",
                "https://tenor.com/view/gay-kiss-gif-16073834",
                "https://cdn.discordapp.com/attachments/884726874889142315/887629194698321970/Mp1q.png",
                "https://cdn.discordapp.com/attachments/884726874889142315/894913918575714304/hqdefault.png"};

        Integer i = (int) Math.floor(Math.random() * 13) + 1;

        if(messageCreateEvent.getMessageContent().equalsIgnoreCase("!gay")) {
            messageCreateEvent.getChannel().sendMessage(gay[i]);
        }

        /*
        new java.util.Timer().schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        messageCreateEvent.deleteMessage();
                    }
                },
                3000
        );

         */

    }
}

