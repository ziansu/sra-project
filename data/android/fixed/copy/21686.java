@javax.annotation.security.RolesAllowed(value = "AUTHENTICATED")
@uk.ac.ebi.biostudy.submission.rest.services.DELETE
@uk.ac.ebi.biostudy.submission.rest.services.Path(value = "/submission/{acc}")
@uk.ac.ebi.biostudy.submission.rest.services.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public void deleteSubmission(@javax.ws.rs.core.Context
uk.ac.ebi.biostudy.submission.rest.data.UserSession userSession, @uk.ac.ebi.biostudy.submission.rest.services.PathParam(value = "acc")
java.lang.String acc) throws java.io.IOException, uk.ac.ebi.biostudy.submission.bsclient.BioStudiesClientException {
    service.deleteSubmission(acc, userSession);
}