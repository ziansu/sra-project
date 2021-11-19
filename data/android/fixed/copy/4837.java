public io.github.galaipa.sbb.Arena getArena(org.bukkit.entity.Player p) {
    for (io.github.galaipa.sbb.Arena a : arenas) {
        for (io.github.galaipa.sbb.ArenaPlayer j : a.players) {
            if (j.getPlayer().equals(p)) {
                return a;
            }
        }
    }
    return null;
}