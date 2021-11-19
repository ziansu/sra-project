public com.pugwoo.wooutils.net.HttpResponse post(java.lang.String httpUrl, byte[] postData) throws java.io.IOException {
    return post(httpUrl, new java.io.ByteArrayInputStream(postData), null);
}