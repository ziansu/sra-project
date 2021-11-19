static java.lang.String encoder(java.lang.String arg) {
    try {
        return java.net.URLEncoder.encode(arg, "UTF-8");
    } catch (java.io.UnsupportedEncodingException e) {
        e.printStackTrace();
        return null;
    }
}