public static void joinTeam(org.bukkit.entity.Player p, net.acampadas21.teamapi.groups.Team t) {
    net.acampadas21.teamapi.TeamManager.db.standardQuery((((("INSERT INTO " + (t.getName())) + " VALUES(") + (t.getName())) + ", 0);"));
}