protected final void response(int state, java.lang.String message) {
    net.sf.json.JSONObject jo = new net.sf.json.JSONObject();
    jo.put(X.STATE, 200);
    jo.put(X.MESSAGE, message);
    this.response(jo);
}