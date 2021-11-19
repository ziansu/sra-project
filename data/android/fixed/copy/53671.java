@javax.ws.rs.POST
@com.soapboxrace.core.api.util.Secured
@javax.ws.rs.Path(value = "SecureLogoutPersona")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_XML)
public java.lang.String secureLogoutPersona(@javax.ws.rs.HeaderParam(value = "securityToken")
java.lang.String securityToken, @javax.ws.rs.HeaderParam(value = "userId")
java.lang.Long userId, @javax.ws.rs.QueryParam(value = "personaId")
java.lang.Long personaId) {
    tokenBO.setActivePersonaId(securityToken, 0L, true);
    return "";
}