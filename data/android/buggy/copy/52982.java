public java.lang.Long getCount(de.btu.openinfra.backend.db.rbac.OpenInfraHttpMethod httpMethod, javax.ws.rs.core.UriInfo uriInfo, java.util.UUID topicCharacteristicId) {
    new de.btu.openinfra.backend.db.rbac.TopicInstanceRbac(currentProjectId, schema).checkPermission(httpMethod, uriInfo);
    return new de.btu.openinfra.backend.db.daos.TopicGeomzDao(topicCharacteristicId, schema, geomType).getCount(topicCharacteristicId);
}