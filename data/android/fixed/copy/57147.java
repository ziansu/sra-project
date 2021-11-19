private java.lang.String getSummary(org.w3c.dom.Node currentEvent) {
    return getTagValue(currentEvent, "description/text()");
}