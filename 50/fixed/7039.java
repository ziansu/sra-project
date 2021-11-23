public void nationLeave(com.palmergames.bukkit.towny.object.Nation nation) {
    remove(nation);
    com.palmergames.bukkit.towny.TownyMessaging.sendGlobalMessage(com.palmergames.bukkit.towny.TownySettings.getWarTimeForfeitMsg(nation.getName()));
    checkEnd();
}