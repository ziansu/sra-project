@javax.annotation.security.PermitAll
@javax.ws.rs.GET
@javax.ws.rs.Path(value = "IP")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public GeoIPManager.GeoInfo getIpResponse(@javax.ws.rs.core.Context
javax.servlet.http.HttpServletRequest request) throws java.lang.Exception {
    return com.sdm.core.util.GeoIPManager.getInfo(request.getRemoteAddr());
}