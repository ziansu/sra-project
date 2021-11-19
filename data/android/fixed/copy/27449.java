@java.lang.Override
public int createUniqueNPCId(net.citizensnpcs.api.npc.NPCRegistry npcr) {
    return (net.goldiriath.plugin.mobspawn.citizens.DummyNPCDataStore.NPC_ID_OFFSET) + ((counter)++);
}