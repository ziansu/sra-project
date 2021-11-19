private java.lang.String getHash(final jd.plugins.DownloadLink dl) {
    final java.lang.String hash = dl.getStringProperty("hash_main", null);
    return hash;
}