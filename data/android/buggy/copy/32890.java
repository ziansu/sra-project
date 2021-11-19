@java.lang.Override
public void onCompleted(org.json.JSONObject object, com.facebook.GraphResponse response) {
    android.util.Log.i(MY_LOG, ("jsonObject=" + (object.toString())));
    jsonResponse = object;
}