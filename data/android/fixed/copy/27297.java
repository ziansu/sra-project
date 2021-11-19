@java.lang.Override
public void onResponse(org.json.JSONObject response) {
    if (listener != null)
        listener.updated(com.tpb.projects.data.models.Card.parse(response));
    
}