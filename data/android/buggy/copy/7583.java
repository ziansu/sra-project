@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/versions")
@io.swagger.annotations.ApiOperation(httpMethod = "GET", value = "Returns source version metadata, including source urls from which " + "data files were downloaded.", response = CellBaseConfiguration.DownloadProperties.class, responseContainer = "QueryResponse")
public javax.ws.rs.core.Response getVersion() {
    org.opencb.cellbase.core.api.CellBaseDBAdaptor metaDBAdaptor = dbAdaptorFactory2.getMetaDBAdaptor(this.species, this.assembly);
    return createOkResponse(metaDBAdaptor.nativeGet(new org.opencb.commons.datastore.core.Query(), new org.opencb.commons.datastore.core.QueryOptions()));
}