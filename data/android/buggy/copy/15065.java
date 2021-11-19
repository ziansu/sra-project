@java.lang.Override
public void load(net.citizensnpcs.api.util.DataKey key) throws net.citizensnpcs.api.exception.NPCLoadException {
    try {
        shouldSpawn = key.getBoolean("");
    } catch (java.lang.Exception ex) {
        shouldSpawn = false;
        throw new net.citizensnpcs.api.exception.NPCLoadException("Invalid value. Valid values: true or false");
    }
}