private static java.lang.String findElement(org.jsoup.nodes.Document doc, java.lang.String cssQuery) {
    org.jsoup.nodes.Element element = doc.select(cssQuery).first();
    return element == null ? "" : element.outerHtml();
}