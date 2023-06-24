package ga.justreddy.wiki.reddypunishments.velocity.commands;

import com.velocitypowered.api.proxy.ProxyServer;
import ga.justreddy.wiki.reddypunishments.velocity.ReddyPunishments;
import ga.justreddy.wiki.reddypunishments.velocity.commands.type.CustomCommand;
import ga.justreddy.wiki.reddypunishments.velocity.util.LoggingUtils;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.val;

import java.util.Map;

/**
 * @author mexish
 * Ty :)
 */
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class BaseCommand {

    ProxyServer server;
    static Map<String, CustomCommand> commands;

    public BaseCommand(ProxyServer server) {
        this.server = server;
        server.getEventManager().register(ReddyPunishments.getInstance(), this);
    }

    public void addCommand(CustomCommand command) {
        commands.put(command.getName(), command);
        server.getCommandManager().register(command.getAlias(), command, command.getAliases());
        LoggingUtils.log("&aRegistered command /" + command.getName());
    }

    public CustomCommand getCommand(String commandName) {
        return commands.getOrDefault(commandName, null);
    }

    public static Map<String, CustomCommand> getCommands() {
        return commands;
    }
}
