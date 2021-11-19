@java.lang.Override
protected void onMessageReceived(org.json.JSONObject json) {
    java.lang.String activity;
    try {
        org.json.JSONObject data = json.getJSONObject("data");
        activity = data.getString("activity");
    } catch (org.json.JSONException e) {
        e.printStackTrace();
        return ;
    }
}