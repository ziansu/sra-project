public org.w3c.dom.NodeList getAnchors(org.w3c.dom.Element rawDoc) {
    if (rawDoc == null) {
        return null;
    }
    org.w3c.dom.NodeList children = rawDoc.getElementsByTagName("a");
    return children;
}