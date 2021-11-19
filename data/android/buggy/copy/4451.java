@pt.webdetails.cfr.GET
@pt.webdetails.cfr.Path(value = "/checkVersion")
public void checkVersion(@javax.ws.rs.core.Context
javax.servlet.http.HttpServletResponse response) throws java.io.IOException, org.json.JSONException {
    writeMessage(getVersionChecker().checkVersion().toJSON().toString(), response.getOutputStream());
}