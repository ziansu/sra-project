public static void createRankAccount(org.bukkit.entity.Player player) {
    if ((project.rank.RankManager.hasRank(player)) || (!(project.rank.RankManager.hasRank(player, Rank.DEFAULT))))
        return ;
    
    project.rank.RankManager.addRank(player, Rank.DEFAULT);
}