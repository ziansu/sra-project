public void nationLeave(com.palmergames.bukkit.towny.object.Nation nation) {
    remove(nation);
    for (com.palmergames.bukkit.towny.object.Town town : nation.getTowns())
        remove(town);
    
    com.palmergames.bukkit.towny.TownyMessaging.sendGlobalMessage(com.palmergames.bukkit.towny.TownySettings.getWarTimeForfeitMsg(nation.getName()));
    checkEnd();
}