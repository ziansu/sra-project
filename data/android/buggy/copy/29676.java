public static com.comcast.cdn.traffic_control.traffic_router.core.loc.NetworkNode generateTree(final java.io.File f) throws com.comcast.cdn.traffic_control.traffic_router.core.loc.NetworkNodeException, java.io.FileNotFoundException, org.apache.wicket.ajax.json.JSONException {
    final org.apache.wicket.ajax.json.JSONObject json = new org.apache.wicket.ajax.json.JSONObject(new org.apache.wicket.ajax.json.JSONTokener(new java.io.FileReader(f)));
    return com.comcast.cdn.traffic_control.traffic_router.core.loc.NetworkNode.generateTree(json);
}