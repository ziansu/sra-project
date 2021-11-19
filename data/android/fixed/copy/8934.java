public void setCacheable(java.lang.Integer _seconds) {
    int seconds = 172800;
    if (_seconds != null) {
        seconds = _seconds.intValue();
    }
    java.lang.String cacheControl = ("max-age=" + seconds) + ", public, must-revalidate";
    addHeader("Cache-Control", cacheControl);
}