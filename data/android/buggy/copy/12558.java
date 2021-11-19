@java.lang.SuppressWarnings(value = "unchecked")
private C decodeXmlIS(java.io.InputStream inputStream, com.thoughtworks.xstream.XStream xstream, C root) {
    C configuration = ((C) (xstream.fromXML(inputStream, root)));
    checkType(configuration);
    return configuration;
}