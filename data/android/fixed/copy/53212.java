public void eliminate(com.palmergames.bukkit.towny.object.Nation nation) {
    com.palmergames.bukkit.towny.TownyMessaging.sendGlobalMessage(com.palmergames.bukkit.towny.TownySettings.getWarTimeEliminatedMsg(nation.getFormattedName()));
}