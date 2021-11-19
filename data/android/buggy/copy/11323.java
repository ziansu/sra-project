@javax.ws.rs.POST
@javax.ws.rs.Produces(value = { javax.ws.rs.core.MediaType.APPLICATION_XML , javax.ws.rs.core.MediaType.APPLICATION_JSON })
@javax.ws.rs.Path(value = "/{id}/discover")
@com.emc.storageos.security.authorization.CheckPermission(roles = { com.emc.storageos.security.authorization.Role.TENANT_ADMIN })
public com.emc.storageos.model.TaskResourceRep discoverHost(@javax.ws.rs.PathParam(value = "id")
java.net.URI id) {
    com.emc.storageos.api.service.impl.resource.ArgValidator.checkFieldUriType(id, com.emc.storageos.db.client.model.Host.class, "id");
    com.emc.storageos.db.client.model.Host host = queryObject(com.emc.storageos.db.client.model.Host.class, id, true);
    return doDiscoverHost(host, null);
}