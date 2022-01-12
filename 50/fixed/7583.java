@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/{species}/versions")
@io.swagger.annotations.ApiOperation(httpMethod = "GET", value = "Returns source version metadata, including source urls from which " + "data files were downloaded.", response = CellBaseConfiguration.DownloadProperties.class, responseContainer = "QueryResponse")
public javax.ws.rs.core.Response getVersion(@javax.ws.rs.PathParam(value = "species")
@io.swagger.annotations.ApiParam(name = "species", value = "Name of the species, e.g.: hsapiens. For a full list of potentially" + ("available species ids, please refer to: " + "http://bioinfo.hpc.cam.ac.uk/cellbase/webservices/rest/latest/meta/species"), required = true)
java.lang.String species) {
    org.opencb.cellbase.core.api.CellBaseDBAdaptor metaDBAdaptor = dbAdaptorFactory2.getMetaDBAdaptor(species, this.assembly);
    return createOkResponse(metaDBAdaptor.nativeGet(new org.opencb.commons.datastore.core.Query(), new org.opencb.commons.datastore.core.QueryOptions()));
}