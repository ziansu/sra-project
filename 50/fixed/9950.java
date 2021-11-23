@javax.ws.rs.GET
@javax.ws.rs.Path(value = "{id}/participant/list")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public java.util.List<fr.sofeed.bean.Employee> getParticipants(@javax.ws.rs.PathParam(value = "id")
int id) {
    fr.sofeed.bean.Project project = fr.sofeed.utils.ProjectUtils.findProjectById(id);
    java.lang.System.out.println(project);
    return project.getTeam();
}