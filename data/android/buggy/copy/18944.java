@java.lang.Override
public void endElement(java.lang.String uri, java.lang.String localName, java.lang.String qName) throws org.xml.sax.SAXException {
    java.lang.System.out.println(("ADDING SPACE AFTER ELEMENT " + localName));
    delegateT.characters(fr.inria.aviz.tikaextensions.tika.xml.CendariTextContentHandler.SPACE, 0, fr.inria.aviz.tikaextensions.tika.xml.CendariTextContentHandler.SPACE.length);
}