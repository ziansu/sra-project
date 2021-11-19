@javax.ws.rs.GET
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public java.util.List<java.lang.String> findEstablishments() {
    return jersey.repackaged.com.google.common.collect.Lists.newArrayList("Paluba", "Hudini");
}