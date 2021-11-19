@javax.ws.rs.POST
@javax.ws.rs.Path(value = "release")
@javax.ws.rs.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public boolean releaseLock(com.palantir.atlasdb.persistentlock.LockEntry lockEntry) throws com.palantir.atlasdb.keyvalue.api.CheckAndSetException {
    lockStore.releaseLock(lockEntry);
    return true;
}