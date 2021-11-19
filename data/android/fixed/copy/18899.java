private long getPublishDelay(java.util.Dictionary properties) {
    java.lang.Object interval = properties.get(com.eclipsesource.jaxrs.publisher.internal.Configuration.PROPERTY_PUBLISH_DELAY);
    if (interval == null) {
        return com.eclipsesource.jaxrs.publisher.internal.Configuration.DEFAULT_PUBLISH_DELAY;
    }
    return ((java.lang.Long) (interval));
}