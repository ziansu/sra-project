@java.lang.Override
public ch.waan.xml.XPath indexRange(int from, int to) {
    return new ch.waan.xml.XPathImp(this.elements.sequential().skip(from).limit((to - from)));
}