public static void despawn(int UID, net.citizensnpcs.api.event.NPCRemoveEvent.NPCRemoveReason reason) {
    if ((net.citizensnpcs.resources.npclib.NPCManager.list.get(UID)) == null)
        return ;
    
    net.citizensnpcs.resources.npclib.NPCManager.GlobalUIDs.remove(UID);
    net.citizensnpcs.resources.npclib.NPCSpawner.despawnNPC(net.citizensnpcs.resources.npclib.NPCManager.list.remove(UID), reason);
}