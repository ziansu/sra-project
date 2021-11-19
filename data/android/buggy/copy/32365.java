@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/status")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public org.picketlink.idm.model.Account status(@javax.ws.rs.core.Context
javax.servlet.http.HttpServletResponse response) {
    if (identity.isLoggedIn()) {
        return identity.getAccount();
    }else {
        return null;
    }
}