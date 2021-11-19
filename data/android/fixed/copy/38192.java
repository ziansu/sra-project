public static java.lang.String getFirstValue(com.digitalpebble.stormcrawler.Metadata md, java.lang.String... keys) {
    for (java.lang.String key : keys) {
        java.lang.String val = md.getFirstValue(key);
        if (org.apache.commons.lang.StringUtils.isBlank(val))
            continue;
        
        return val;
    }
    return null;
}