public InfoMessage getClientMessage(java.io.InputStream inputStream) throws org.json.simple.parser.ParseException {
    org.json.simple.JSONObject json = getJSONObject(inputStreamToString(inputStream));
    return InfoMessage.parseInfoMessage(((org.json.simple.JSONObject) (json)));
}