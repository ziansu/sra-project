@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/obtenerCasoPorIUE")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@java.lang.SuppressWarnings(value = "finally")
public logica.Caso obtenerCasoPorIUE(@javax.ws.rs.QueryParam(value = "usrKey")
java.lang.String usuarioActual, @javax.ws.rs.QueryParam(value = "iUE")
java.lang.String iUE) {
    logica.Caso c = null;
    try {
        c = logica.ControladoraCaso.obtenerCasoPorIUE(usuarioActual, iUE);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    } finally {
        return c;
    }
}