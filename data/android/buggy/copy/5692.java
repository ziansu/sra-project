public void addJSONPostParam(org.json.JSONObject jsonObject) {
    setGetToPostMethod();
    com.squareup.okhttp.MediaType mediaType = com.squareup.okhttp.MediaType.parse("application/json; charset=utf-8");
    com.squareup.okhttp.RequestBody requestBody = com.squareup.okhttp.RequestBody.create(mediaType, jsonObject.toString());
    requestBuilder.post(requestBody);
}