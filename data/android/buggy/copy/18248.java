@com.adform.academy.data.logic.GET
@com.adform.academy.data.logic.Produces(value = "application/json")
@com.adform.academy.data.logic.Path(value = "/{group}/{name}/{version}")
public java.lang.String getSchemeByVersion(@com.adform.academy.data.logic.PathParam(value = "group")
java.lang.String groupName, @com.adform.academy.data.logic.PathParam(value = "name")
java.lang.String schemeName, @com.adform.academy.data.logic.PathParam(value = "version")
java.lang.Double version) {
    return gson.toJson(clientDB.getScheme(groupName, schemeName, version));
}