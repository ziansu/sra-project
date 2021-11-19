private void getTeachers() throws java.io.IOException, me.vertretungsplan.exception.CredentialInvalidException, org.json.JSONException {
    if ((teachers) == null) {
        final java.lang.String url = (api) + "/lehrer";
        teachers = getJSONArray(url);
    }
}