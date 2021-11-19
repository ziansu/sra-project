@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/checkVersion")
@javax.ws.rs.Produces(value = pt.webdetails.cpf.utils.MimeTypes.JSON)
public java.lang.String checkVersion() throws org.json.JSONException {
    return getVersionChecker().checkVersion().toJSON().toString();
}