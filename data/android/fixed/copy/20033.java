private static java.lang.String parseYML(java.lang.String data) {
    java.lang.String jsonString = ConfigUtil2.convertToJson(data);
    java.lang.String xmlString = ConfigUtil2.convertToXML(jsonString);
    java.lang.System.out.println(("xmlString: " + xmlString));
    return xmlString;
}