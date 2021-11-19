@javax.ws.rs.DELETE
@javax.ws.rs.Path(value = "/{groupName}")
public javax.ws.rs.core.Response deleteGroup(@javax.ws.rs.PathParam(value = "groupName")
java.lang.String groupName) throws org.jivesoftware.openfire.plugin.rest.exceptions.ServiceException {
    groupController.deleteGroup(groupName);
    return javax.ws.rs.core.Response.status(Response.Status.OK).build();
}