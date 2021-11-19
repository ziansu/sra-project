public static java.lang.String readToString(java.io.InputStream inputStream) throws java.io.IOException {
    return com.openshift.express.internal.client.utils.StreamUtils.readToString(new java.io.InputStreamReader(inputStream));
}