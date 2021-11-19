@javax.ws.rs.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@javax.ws.rs.POST
@javax.ws.rs.Path(value = "{path:plannings}")
@javax.ws.rs.Produces(value = "application/json")
java.lang.String submitPlannings(@javax.ws.rs.HeaderParam(value = "sessionid")
java.lang.String sessionId, @javax.ws.rs.PathParam(value = "path")
javax.ws.rs.core.PathSegment pathSegment, java.util.Map<java.lang.String, java.lang.String> jobContentXmlString) throws java.io.IOException, org.ow2.proactive_grid_cloud_portal.scheduler.exception.JobCreationRestException, org.ow2.proactive_grid_cloud_portal.scheduler.exception.NotConnectedRestException, org.ow2.proactive_grid_cloud_portal.scheduler.exception.PermissionRestException, org.ow2.proactive_grid_cloud_portal.scheduler.exception.SubmissionClosedRestException;