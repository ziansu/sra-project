@javax.ws.rs.DELETE
@javax.ws.rs.Path(value = "/deleteDivision/{division}")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response deleteDivision(@javax.ws.rs.PathParam(value = "division")
java.lang.Integer division) {
    com.transaction.batch.division.DivisionTransactions divisionTransactions = new com.transaction.batch.division.DivisionTransactions();
    divisionTransactions.deletedivision(getRegId(), division);
    return javax.ws.rs.core.Response.status(Response.Status.OK).build();
}