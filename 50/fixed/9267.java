public java.lang.String getPathUrl() {
    if ((pathUrl) == null) {
        pathUrl = getPathEncoded();
        pathUrl += com.composum.sling.core.util.LinkUtil.getExtension(resource, null);
    }
    return pathUrl;
}