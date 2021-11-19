private java.lang.String filterTitleAndSubtitle(org.jsoup.nodes.Element element) {
    org.jsoup.select.Elements elementToCheck = element.select(".name");
    return (elementToCheck.first().text()) + ".";
}