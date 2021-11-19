@javax.ws.rs.GET
@javax.ws.rs.Path(value = "{jobId}")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public java.lang.String status(@javax.ws.rs.PathParam(value = "jobId")
final java.lang.String jobId) {
    final org.springframework.batch.core.JobInstance job = this.jobExplorer.getJobInstance(java.lang.Long.valueOf(jobId));
    return job.getJobName();
}