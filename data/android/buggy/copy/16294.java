@java.lang.Override
public void call(java.lang.Object... args) {
    org.json.JSONObject error = ((org.json.JSONObject) (args[0]));
    getTarget().onFailedLocationUpdate(error);
}