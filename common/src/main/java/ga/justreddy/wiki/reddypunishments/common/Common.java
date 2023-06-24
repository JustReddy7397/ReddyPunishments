package ga.justreddy.wiki.reddypunishments.common;

import ga.justreddy.wiki.reddypunishments.common.storage.type.Storage;
import org.bukkit.plugin.java.JavaPlugin;

public final class Common  {

    private static Storage storage;

    public static void initialize(Storage storage) {
        Common.storage = storage;
    }

    public static Storage getStorage() {
        if (storage == null) throw new IllegalStateException("Data Storage has not been set!");
        return storage;
    }

}
