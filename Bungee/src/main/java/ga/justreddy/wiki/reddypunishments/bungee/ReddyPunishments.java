package ga.justreddy.wiki.reddypunishments.bungee;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.md_5.bungee.api.plugin.Plugin;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
public final class ReddyPunishments extends Plugin {

    @Getter
    static ReddyPunishments instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
