package ga.justreddy.wiki.reddypunishments.common.storage.type;

import ga.justreddy.wiki.reddypunishments.common.enums.PunishmentType;
import ga.justreddy.wiki.reddypunishments.common.storage.holder.PunishmentHolder;

import java.util.List;
import java.util.UUID;

public interface Storage {

    void connect();

    boolean punish(PunishmentType type, UUID victim, String moderator, String reason, long end, long time,
                   boolean silent,
                   boolean active,
                   String ip
    );

    void pardon(PunishmentType type, UUID victim, String moderator);

    List<PunishmentHolder> getPunishments();

    List<PunishmentHolder> getActivePunishments();

    List<PunishmentHolder> getPunishments(UUID uniqueId);

    List<PunishmentHolder> getActivePunishments(UUID uniqueId);

    List<PunishmentHolder> getPunishments(PunishmentType type, UUID uniqueId);

    List<PunishmentHolder> getActivePunishments(PunishmentType type, UUID uniqueId);

    PunishmentHolder getActivePunishment(PunishmentType type, UUID uniqueId);

    void close();

}
