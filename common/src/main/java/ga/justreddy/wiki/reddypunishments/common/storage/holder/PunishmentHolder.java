package ga.justreddy.wiki.reddypunishments.common.storage.holder;

import ga.justreddy.wiki.reddypunishments.common.enums.PunishmentType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class PunishmentHolder {

    PunishmentType type;
    UUID victim;
    String moderator;
    String reason;
    long end;
    long date;
    boolean silent;
    boolean active;
    String ip;



}
