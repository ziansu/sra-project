@java.lang.Override
public void onResponse(org.json.JSONObject response) {
    android.util.Log.i(com.tpb.projects.data.Editor.TAG, ("onResponse: Card update: " + (response.toString())));
    if (listener != null)
        listener.updated(com.tpb.projects.data.models.Card.parse(response));
    
}