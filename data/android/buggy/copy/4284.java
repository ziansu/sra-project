private java.lang.String getCategory(org.jsoup.nodes.Element insideInformations) {
    org.jsoup.select.Elements elements = insideInformations.select(".emp-categories").last().select("a");
    return java.util.Objects.nonNull(elements) ? elements.last().text() : "";
}