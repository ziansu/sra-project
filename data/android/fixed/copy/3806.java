public static final java.lang.String prettyFormatXml(java.io.InputStream newInputStream) {
    if (newInputStream == null) {
        return null;
    }
    return com.tomecode.oracle.osb12c.Utils.formatXml(new javax.xml.transform.stream.StreamSource(newInputStream));
}