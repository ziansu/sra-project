@java.lang.Override
protected org.json.simple.JSONObject doInBackground(java.lang.String... params) {
    try {
        sendRequest();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return profileInfo;
}