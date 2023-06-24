package ga.justreddy.wiki.reddypunishments.velocity.util;

import ga.justreddy.wiki.reddypunishments.velocity.ReddyPunishments;

public class LoggingUtils {

    public static void log(String message) {
        ReddyPunishments.getInstance().getServer().sendMessage(
                ChatUtil.message("&b[&dReddyPunishments&b] &r" + message)
        );
    }

}
