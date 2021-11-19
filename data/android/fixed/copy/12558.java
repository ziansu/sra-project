@java.lang.SuppressWarnings(value = "unchecked")
private C decodeXmlIS(java.io.InputStream inputStream, com.thoughtworks.xstream.XStream xstream, C root) {
    java.lang.Object configuration = xstream.fromXML(inputStream, root);
    checkType(configuration);
    return ((C) (configuration));
}