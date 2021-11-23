public org.json.JSONObject getDataWithoutHeader() {
    org.json.JSONObject dataCopy = new org.json.JSONObject(data.toString());
    dataCopy.remove("message");
    dataCopy.remove("title");
    return dataCopy;
}