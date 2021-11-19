@java.lang.Override
public java.lang.String sAddAIReq(shared.definitions.AIType aitype) throws org.json.JSONException {
    org.json.JSONObject obj = new org.json.JSONObject();
    obj.put("AIType", shared.definitions.AIType.toString(aitype));
    return obj.toString();
}