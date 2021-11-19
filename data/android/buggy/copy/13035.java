@javax.ws.rs.Path(value = "release")
public void releaseLock(com.palantir.atlasdb.persistentlock.LockEntry lockEntry) throws com.palantir.atlasdb.keyvalue.api.CheckAndSetException {
    lockStore.releaseLock(lockEntry);
}