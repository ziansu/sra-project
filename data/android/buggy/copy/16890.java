public void displayTeamInActionBar(org.bukkit.entity.Player player) {
    eu.carrade.amaury.UHCReloaded.teams.UHTeam team = getTeamForPlayer(player);
    if (team == null)
        return ;
    
    fr.zcraft.zlib.tools.text.ActionBar.sendPermanentMessage(player, fr.zcraft.zlib.components.i18n.I.t("{gold}Your team: {0}", team.getDisplayName()));
}