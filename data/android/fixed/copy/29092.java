@javax.ws.rs.GET
@javax.ws.rs.Path(value = "teamid/{id}")
public javax.ws.rs.core.Response findAllWorkItemsByTeamId(@javax.ws.rs.PathParam(value = "id")
final java.lang.Long teamId) {
    java.util.List<se.meer.jpa.model.WorkItem> workItems = service.findAllWorkItemsByTeamId(teamId);
    return javax.ws.rs.core.Response.ok().entity(workItems).build();
}