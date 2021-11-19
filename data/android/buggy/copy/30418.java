@java.lang.Override
public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
    return (element.hasAttr(key)) && (value.equalsIgnoreCase(element.attr(key)));
}