package ga.justreddy.wiki.reddypunishments.velocity.util;

import com.velocitypowered.api.proxy.Player;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;

public class ChatUtil {

    public static Component message(String message) {
        return legacySerializer.deserialize(message);
    }

    public static String sMessage(String message) {
        return message(message).toString();
    }

    public static void sendMessage(String message, Player p) {
        p.sendMessage(message(message));
    }

    public static final LegacyComponentSerializer legacySerializer = LegacyComponentSerializer
            .builder()
            .character('&').hexColors()
            .useUnusualXRepeatedCharacterHexFormat().build();


}
