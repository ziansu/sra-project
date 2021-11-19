@java.lang.Override
public void load(net.citizensnpcs.api.util.DataKey key) throws net.citizensnpcs.api.exception.NPCLoadException {
    shouldSpawn = key.getBoolean("");
}