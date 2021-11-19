@org.apache.camel.Converter
public static org.bson.Document fromStringToDocument(java.lang.String s) {
    org.bson.Document answer = null;
    try {
        answer = org.bson.Document.parse(s);
    } catch (java.lang.Exception e) {
        org.apache.camel.component.mongodb3.converters.MongoDbBasicConverters.LOG.warn("String -> Document conversion selected, but the following exception occurred. Returning null.", e);
    }
    return answer;
}