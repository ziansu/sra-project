@org.jbei.ice.services.rest.PUT
@org.jbei.ice.services.rest.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@org.jbei.ice.services.rest.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@org.jbei.ice.services.rest.Path(value = "/{id}/entries")
public javax.ws.rs.core.Response removeEntriesFromFolder(@org.jbei.ice.services.rest.PathParam(value = "id")
final long folderId, final org.jbei.ice.lib.entry.EntrySelection entrySelection) {
    final java.lang.String userId = getUserId();
    if (controller.removeFolderContents(userId, folderId, entrySelection)) {
        return respond(Response.Status.OK);
    }
    return respond(Response.Status.INTERNAL_SERVER_ERROR);
}