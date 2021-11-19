public java.lang.String getValue(org.w3c.dom.Element item, java.lang.String str) {
    org.w3c.dom.NodeList n = item.getElementsByTagName(str);
    return this.getValue(n.item(0));
}