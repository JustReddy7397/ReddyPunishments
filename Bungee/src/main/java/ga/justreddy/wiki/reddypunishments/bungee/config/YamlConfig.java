package ga.justreddy.wiki.reddypunishments.bungee.config;

import ga.justreddy.wiki.reddypunishments.bungee.ReddyPunishments;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.NonFinal;
import net.md_5.bungee.config.Configuration;
import net.md_5.bungee.config.ConfigurationProvider;
import net.md_5.bungee.config.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class YamlConfig {

    static String VERSION_KEY = "config-version";

    @Getter
    final File file;

    @Getter
    @NonFinal
    Configuration config;


    public YamlConfig(String name) throws IOException {
        String finalName = name.endsWith(".yml") ? name : name + ".yml";
        File file = new File(ReddyPunishments.getInstance().getDataFolder().getAbsolutePath(), finalName);

        if (!file.exists()) {
            ReddyPunishments.getInstance().getDataFolder().mkdir();
            Files.copy(ReddyPunishments.getInstance().getResourceAsStream(finalName), file.toPath());
        }

        this.file = file;
        this.config =  ConfigurationProvider.getProvider(YamlConfiguration.class).load(file);
        reload();
    }

    public void reload() throws IOException {
        this.config = ConfigurationProvider.getProvider(YamlConfiguration.class).load(file);
    }

    public void save() throws IOException {
        ConfigurationProvider.getProvider(YamlConfiguration.class).save(config, file);
    }

    public boolean isOutdated(final int currentVersion) {
        return config.getInt(VERSION_KEY, -1) < currentVersion;
    }


}
