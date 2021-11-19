@java.lang.Override
public void setId(java.lang.String id) {
    try {
        this.id = new java.net.URL(id).toString();
    } catch (java.net.MalformedURLException e) {
        this.id = "urn:" + id;
    }
}