private static org.jsoup.nodes.Element findElement(org.jsoup.nodes.Document doc, java.lang.String cssQuery) {
    return doc.select(cssQuery).first();
}