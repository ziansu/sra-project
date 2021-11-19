private org.jsoup.nodes.Document getDocument(java.lang.String urlOpen) {
    org.jsoup.nodes.Document doc;
    try {
        doc = org.jsoup.Jsoup.connect(urlOpen).get();
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(e.toString());
    }
    return doc;
}