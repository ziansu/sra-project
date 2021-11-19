@javax.ws.rs.POST
@com.wordnik.swagger.annotations.ApiOperation(value = "Set status.", notes = "Sets the status of a given run ID using a MethodCallStatusEnum and status message.", response = java.lang.String.class)
@com.wordnik.swagger.annotations.ApiResponses(value = { @com.wordnik.swagger.annotations.ApiResponse(code = 200, message = "") })
@edu.pitt.apollo.brokerservicerestfrontend.controller.RequestMapping(value = "/run/{runId}/status", method = RequestMethod.POST, headers = "Accept=application/xml")
@edu.pitt.apollo.brokerservicerestfrontend.controller.ResponseBody
public java.lang.String updateStatusOfRun(@com.wordnik.swagger.annotations.ApiParam(value = "Run ID.", required = true)
@edu.pitt.apollo.brokerservicerestfrontend.controller.PathVariable(value = "runId")
java.math.BigInteger runId, @com.wordnik.swagger.annotations.ApiParam(value = "Method call status enum", required = true)
@edu.pitt.apollo.brokerservicerestfrontend.controller.RequestParam(value = "methodCallStatusEnum")
edu.pitt.apollo.brokerservicerestfrontend.controller.MethodCallStatusEnum statusToUpdateTo, @com.wordnik.swagger.annotations.ApiParam(value = "Status message", required = true)
@edu.pitt.apollo.brokerservicerestfrontend.controller.RequestParam(value = "statusMessage")
java.lang.String statusMessage, @com.wordnik.swagger.annotations.ApiParam(value = "Username", required = true)
@edu.pitt.apollo.brokerservicerestfrontend.controller.RequestParam(value = "username")
java.lang.String username, @com.wordnik.swagger.annotations.ApiParam(value = "Password", required = true)
@edu.pitt.apollo.brokerservicerestfrontend.controller.RequestParam(value = "password")
java.lang.String password) throws edu.pitt.apollo.exception.SerializationException, edu.pitt.apollo.exception.UnsupportedSerializationFormatException {
    return new edu.pitt.apollo.brokerservicerestfrontend.methods.SetStatusOfRunMethod(username, password, SerializationFormat.XML).setStatusOfRun(runId, statusToUpdateTo, username);
}