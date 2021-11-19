public com.digitalpebble.storm.crawler.Metadata getMetaForOutlink(java.lang.String sourceURL, com.digitalpebble.storm.crawler.Metadata parentMD) {
    com.digitalpebble.storm.crawler.Metadata md = filter(parentMD);
    if (trackPath) {
        md.addValue(com.digitalpebble.storm.crawler.util.MetadataTransfer.urlPathKeyName, sourceURL);
    }
    return md;
}