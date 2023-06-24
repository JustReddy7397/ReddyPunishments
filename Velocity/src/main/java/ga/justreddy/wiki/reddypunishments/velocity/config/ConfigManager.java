package ga.justreddy.wiki.reddypunishments.velocity.config;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author JustReddy
 */
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ConfigManager {

    static File folder;
    @Getter static YamlConfig settings;
    @Getter static YamlConfig database;
    @Getter static YamlConfig messages;
    @Getter static List<YamlConfig> configs;

    public static void initialize(File folder) {
        settings = new YamlConfig(folder, "settings.yml");
        database = new YamlConfig(folder, "database.yml");
        messages = new YamlConfig(folder, "messages.yml");
        configs = new ArrayList<>();
        configs.add(settings);
        configs.add(database);
        configs.add(messages);

    }

    public static void reload() {
        configs.forEach(config -> {
            config.reload();
            config.initiate(folder);
        });
    }

    public static void add(YamlConfig config) {
        configs.add(config);
    }

}
