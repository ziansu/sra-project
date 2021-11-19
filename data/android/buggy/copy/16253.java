public void extractContentAndMetadata(org.exist.xquery.value.BinaryValue binaryValue, org.exist.util.serializer.Receiver receiver) throws java.io.IOException, org.exist.contentextraction.ContentExtractionException, org.xml.sax.SAXException {
    extractContentAndMetadata(binaryValue, new org.exist.util.serializer.SAXToReceiver(receiver));
}