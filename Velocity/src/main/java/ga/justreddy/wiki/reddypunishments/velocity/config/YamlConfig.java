package ga.justreddy.wiki.reddypunishments.velocity.config;

import ga.justreddy.wiki.reddypunishments.velocity.ReddyPunishments;
import ga.justreddy.wiki.reddypunishments.velocity.config.type.YamlConfiguration;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.io.File;

/**
 * @author JustReddy
 */

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Getter
public class YamlConfig extends YamlConfiguration {

    static YamlConfig config;

    static String name;

    public YamlConfig(File folder, String path) {
        super(folder, path);
        name = path;
        reload();
    }

    public void initiate(File file) {
        config = new YamlConfig(ReddyPunishments.getFolder().toFile(), name);
    }
}
