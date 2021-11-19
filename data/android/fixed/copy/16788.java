@java.lang.Override
public void onResponse(java.lang.String response) throws org.json.JSONException {
    org.json.JSONObject jsonObject = new org.json.JSONObject(response);
    application.getDbHelper().insertSelectedWorkout(jsonObject, false, true);
    if (callback != null) {
        callback.onSave();
    }
}