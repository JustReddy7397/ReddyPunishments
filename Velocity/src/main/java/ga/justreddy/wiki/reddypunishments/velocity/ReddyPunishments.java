package ga.justreddy.wiki.reddypunishments.velocity;

import com.google.inject.Inject;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.plugin.annotation.DataDirectory;
import com.velocitypowered.api.proxy.ProxyServer;
import ga.justreddy.wiki.reddypunishments.velocity.commands.BaseCommand;
import ga.justreddy.wiki.reddypunishments.velocity.config.ConfigManager;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.slf4j.Logger;

import java.nio.file.Path;

/**
 * @author JustReddy
 */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Plugin(id = "reddypunishments",
        name = "ReddyPunishments",
        version = "1.0",
        authors = {"JustReddy"})
public class ReddyPunishments {

    @Inject
    Logger logger;

    final ProxyServer server;
    @Getter static ReddyPunishments instance;
    @Getter static Path folder;

    @Inject
    private ReddyPunishments(ProxyServer server, @DataDirectory final Path folder) {
        this.server = server;
        ReddyPunishments.folder = folder;
    }

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
        instance = this;
        ConfigManager.initialize(folder.toFile());
        BaseCommand baseCommand = new BaseCommand(getServer());
    }
}
