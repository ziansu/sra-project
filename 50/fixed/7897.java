@java.lang.Override
public javax.ws.rs.core.Response toResponse(fr.ac_versailles.crdp.apiscol.meta.IncorrectMetadataKeySyntaxException e) {
    return javax.ws.rs.core.Response.status(Status.BAD_REQUEST).type(MediaType.APPLICATION_XML).entity(e.getXMLMessage()).build();
}