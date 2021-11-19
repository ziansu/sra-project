public static void removePlayer(java.lang.String uuid) {
    if (me.cuebyte.nexus.customized.NexusDatabase.players.containsKey(uuid))
        me.cuebyte.nexus.customized.NexusDatabase.players.remove(uuid);
    
}