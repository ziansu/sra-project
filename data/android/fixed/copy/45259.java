public static int getPlayerAttempts(java.lang.String playerName) {
    playerName = playerName.toLowerCase();
    if (com.hsun324.protection.ProtectionSystem.playerProtectionMap.containsKey(playerName))
        return com.hsun324.protection.ProtectionSystem.playerProtectionMap.get(playerName).getAttempts();
    
    return 0;
}