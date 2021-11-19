public static void scheduleRespawn(net.citizensnpcs.resources.npclib.HumanNPC npc, int delay) {
    new net.citizensnpcs.TickTask.RespawnTask(npc).register(delay);
}