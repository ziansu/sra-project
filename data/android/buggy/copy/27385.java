@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/{viewId}.svg")
@javax.ws.rs.Produces(value = "image/svg+xml")
public javax.ws.rs.core.Response getImageAsSvg(@javax.ws.rs.PathParam(value = "networkId")
java.lang.Long networkId, @javax.ws.rs.PathParam(value = "viewId")
java.lang.Long viewId) {
    return getImageForView("svg", networkId, viewId, 500);
}