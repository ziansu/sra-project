public java.lang.Object get(java.lang.String link) {
    try {
        return remoteGet.send(link, null);
    } catch (java.lang.Exception e) {
        return e;
    }
}