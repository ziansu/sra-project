@javax.ws.rs.PUT
@javax.ws.rs.Consumes(value = { javax.ws.rs.core.MediaType.APPLICATION_XML , javax.ws.rs.core.MediaType.APPLICATION_JSON })
@javax.ws.rs.Path(value = "/{id}/assign-matched-pools")
@javax.ws.rs.Produces(value = { javax.ws.rs.core.MediaType.APPLICATION_XML , javax.ws.rs.core.MediaType.APPLICATION_JSON })
@com.emc.storageos.security.authorization.CheckPermission(roles = { com.emc.storageos.security.authorization.Role.SYSTEM_ADMIN , com.emc.storageos.security.authorization.Role.RESTRICTED_SYSTEM_ADMIN })
public com.emc.storageos.model.vpool.FileVirtualPoolRestRep updateFileVirtualPoolWithAssignedPools(@javax.ws.rs.PathParam(value = "id")
java.net.URI id, com.emc.storageos.model.vpool.VirtualPoolPoolUpdateParam param) {
    com.emc.storageos.db.client.model.VirtualPool virtualPool = updateVirtualPoolWithAssignedStoragePools(id, param);
    setVpoolSnapshotScheduleCapability(virtualPool, true);
    return com.emc.storageos.api.mapper.VirtualPoolMapper.toFileVirtualPool(vPool, com.emc.storageos.db.client.model.VirtualPool.getFileRemoteProtectionSettings(vPool, _dbClient));
}