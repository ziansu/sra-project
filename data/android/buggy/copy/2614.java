public void addByteArrayPostParam(final byte[] data) {
    setGetToPostMethod();
    com.squareup.okhttp.MediaType mediaType = com.squareup.okhttp.MediaType.parse("application/octet-stream");
    com.squareup.okhttp.RequestBody requestBody = com.squareup.okhttp.RequestBody.create(mediaType, data);
    requestBuilder.post(requestBody);
}