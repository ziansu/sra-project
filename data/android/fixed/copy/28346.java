@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/id/{id}")
@javax.ws.rs.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public datamodel.Car getById(@javax.ws.rs.PathParam(value = "id")
java.lang.String id) throws java.io.IOException, org.codehaus.jettison.json.JSONException {
    DAO.DAOSolr dao = new DAO.DAOSolr();
    datamodel.Car result = dao.getElementById(id);
    Recommendation.UserActions save = new Recommendation.UserActions();
    save.saveCarViewed(result);
    return result;
}