public void setLink(java.lang.String link) {
    try {
        this.link = new java.net.URL(link);
    } catch (java.net.MalformedURLException e) {
        throw new java.lang.RuntimeException(e);
    }
}