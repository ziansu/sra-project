@javax.ws.rs.POST
@javax.ws.rs.Path(value = "{barcode}")
@javax.ws.rs.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.TEXT_PLAIN)
public java.lang.String updateComponent(@javax.ws.rs.PathParam(value = "barcode")
java.lang.String barcode, DTO.ComponentDTO component) {
    int returnStatus = dao.updateComponent(barcode, component);
    if (returnStatus == 1)
        return "All Ok";
    else
        throw new javax.ws.rs.WebApplicationException(500);
    
}