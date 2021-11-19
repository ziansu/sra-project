private java.lang.String getStreamName(java.lang.String streamName) {
    java.lang.String[] parts = streamName.split("/");
    if ((parts.length) > 1)
        return parts[((parts.length) - 1)];
    
    return "";
}