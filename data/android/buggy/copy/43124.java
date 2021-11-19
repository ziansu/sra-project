public static void createTeam(org.bukkit.entity.Player p) {
    java.util.ArrayList<org.bukkit.entity.Player> group = new java.util.ArrayList<org.bukkit.entity.Player>();
    group.add(p);
    com.theminequest.MineQuest.Team.TeamManager.createTeam(group);
}