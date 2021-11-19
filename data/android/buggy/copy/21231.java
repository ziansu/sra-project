@java.lang.Override
protected org.json.JSONObject doInBackground(java.lang.String... params) {
    return connector.getDataFromServer(params[0], ("usr_phone=" + (params[1])));
}