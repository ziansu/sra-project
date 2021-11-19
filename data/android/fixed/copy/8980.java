public java.lang.String getContainerAsGC() {
    if ((container) == null)
        return null;
    
    java.lang.String s = cmanager.Geocache.CONTAINER.get(container, 0);
    return s;
}