public static javax.ws.rs.core.Response getSimpleTextResponse(at.jku.se.dm.rest.HttpCode code, java.lang.String text) {
    javax.ws.rs.core.Response r = javax.ws.rs.core.Response.status(code.getCode()).entity(text).build();
    return at.jku.se.dm.rest.RestResponse.addResponseHeaders(r);
}