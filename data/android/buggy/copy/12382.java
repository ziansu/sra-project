public static void addPlayer(java.lang.String uuid, me.cuebyte.nexus.customized.NexusPlayer player) {
    if (!(me.cuebyte.nexus.customized.NexusDatabase.players.containsKey(me.cuebyte.nexus.customized.NexusDatabase.players)))
        me.cuebyte.nexus.customized.NexusDatabase.players.put(uuid, player);
    
}