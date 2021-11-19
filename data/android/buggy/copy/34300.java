public org.jsoup.nodes.Element getElementById(java.lang.String id) {
    org.jsoup.nodes.Element element = document.getElementById(id);
    if (!(isNullElement(element))) {
        return element;
    }
    return null;
}