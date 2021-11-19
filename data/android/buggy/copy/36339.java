@com.adform.academy.data.logic.DELETE
@com.adform.academy.data.logic.Path(value = "/{group}/{name}/{version}")
public void deleteScheme(@com.adform.academy.data.logic.PathParam(value = "group")
java.lang.String groupName, @com.adform.academy.data.logic.PathParam(value = "name")
java.lang.String schemeName, @com.adform.academy.data.logic.PathParam(value = "version")
java.lang.Double version) {
    clientDB.deleteScheme(clientDB.getScheme(groupName, schemeName, version));
}