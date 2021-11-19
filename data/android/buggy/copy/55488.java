@javax.ws.rs.GET
public com.nhl.link.rest.DataResponse<org.apache.cayenne.E25> getAll(@javax.ws.rs.core.Context
javax.ws.rs.core.UriInfo uriInfo) {
    return com.nhl.link.rest.LinkRest.select(org.apache.cayenne.E25.class, config).uri(uriInfo).getOne();
}