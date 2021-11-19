void setUsername(java.lang.String username) {
    try {
        this.username = java.net.URLEncoder.encode(username, "UTF-8");
    } catch (java.io.UnsupportedEncodingException e) {
        e.printStackTrace();
    }
}