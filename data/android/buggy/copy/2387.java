@java.lang.Override
public javax.ws.rs.core.Response toResponse(java.lang.Throwable e) {
    co.edu.unicartagena.platf.model.ErrorMessage errorMessage = new co.edu.unicartagena.platf.model.ErrorMessage(0, e.getMessage(), "No documentation for now.");
    return javax.ws.rs.core.Response.status(Response.Status.INTERNAL_SERVER_ERROR).type(MediaType.APPLICATION_JSON).entity(errorMessage).build();
}