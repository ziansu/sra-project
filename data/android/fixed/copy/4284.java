private java.lang.String getCategory(org.jsoup.nodes.Element insideInformations) {
    org.jsoup.nodes.Element elements = insideInformations.select(".emp-categories").last().select("a").last();
    return java.util.Objects.nonNull(elements) ? elements.text() : "";
}