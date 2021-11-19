private java.lang.String trackable(java.lang.String message) {
    for (java.lang.String key : com.ltrflog4j.LtrfLog4jAppender.keyStrings) {
        if (message.contains(key));
        return key;
    }
    return null;
}