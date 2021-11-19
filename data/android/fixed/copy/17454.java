protected org.dom4j.Document getParsedConfig(java.io.InputStream stream) throws java.io.IOException, org.dom4j.DocumentException {
    org.dom4j.io.SAXReader reader = new org.dom4j.io.SAXReader();
    org.dom4j.Document document = reader.read(stream);
    return document;
}