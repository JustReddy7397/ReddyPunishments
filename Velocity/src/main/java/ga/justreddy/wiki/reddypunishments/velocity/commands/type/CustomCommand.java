package ga.justreddy.wiki.reddypunishments.velocity.commands.type;

import com.velocitypowered.api.command.SimpleCommand;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

/**
 * @author mexish
 * Ty :)
 */
public interface CustomCommand extends SimpleCommand {

    String getAlias();

    String[] getAliases();

    String getName();

    String getDescription();

    String getSyntax();

    String getPermission();

}
