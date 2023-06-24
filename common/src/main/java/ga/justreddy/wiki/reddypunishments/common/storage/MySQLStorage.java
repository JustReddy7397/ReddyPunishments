package ga.justreddy.wiki.reddypunishments.common.storage;

import ga.justreddy.wiki.reddypunishments.common.enums.PunishmentType;
import ga.justreddy.wiki.reddypunishments.common.storage.holder.PunishmentHolder;
import ga.justreddy.wiki.reddypunishments.common.storage.type.Storage;

import java.util.List;
import java.util.UUID;

public class MySQLStorage implements Storage {
    @Override
    public void connect() {

    }

    @Override
    public boolean punish(PunishmentType type, UUID victim, String moderator, String reason, long end, long time, boolean silent, boolean active, String ip) {
        return false;
    }

    @Override
    public void pardon(PunishmentType type, UUID victim, String moderator) {

    }

    @Override
    public List<PunishmentHolder> getPunishments() {
        return null;
    }

    @Override
    public List<PunishmentHolder> getActivePunishments() {
        return null;
    }

    @Override
    public List<PunishmentHolder> getPunishments(UUID uniqueId) {
        return null;
    }

    @Override
    public List<PunishmentHolder> getActivePunishments(UUID uniqueId) {
        return null;
    }

    @Override
    public List<PunishmentHolder> getPunishments(PunishmentType type, UUID uniqueId) {
        return null;
    }

    @Override
    public List<PunishmentHolder> getActivePunishments(PunishmentType type, UUID uniqueId) {
        return null;
    }

    @Override
    public PunishmentHolder getActivePunishment(PunishmentType type, UUID uniqueId) {
        return null;
    }

    @Override
    public void close() {

    }
}
