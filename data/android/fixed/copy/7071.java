@javax.ws.rs.GET
@javax.ws.rs.Path(value = "node/{id}/api/p")
public java.lang.String getNode(@javax.ws.rs.PathParam(value = "id")
java.lang.Long id) throws java.lang.Exception {
    return serialize(marketplaceDAO.getContent(id));
}