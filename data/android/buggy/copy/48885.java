public void assignScoreboard(net.caseif.flint.challenger.Challenger ch) {
    org.bukkit.Bukkit.getPlayer(ch.getUniqueId()).setScoreboard((net.caseif.ttt.util.MiscUtil.isTraitor(ch) ? traitor : innocent));
    update(ch);
}