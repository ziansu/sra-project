private void doWhenResponseIsUnsuccessful(java.net.HttpURLConnection httpURLConnection, int responseCode) {
    java.io.InputStream is;
    is = httpURLConnection.getErrorStream();
}