public de.uniks.networkparser.xml.XMLEntity withValue(java.lang.String value) {
    de.uniks.networkparser.xml.XMLTokener tokener = new de.uniks.networkparser.xml.XMLTokener();
    tokener.withBuffer(value);
    withValue(tokener);
    return this;
}