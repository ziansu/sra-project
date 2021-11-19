@org.apache.camel.Converter
public static org.bson.Document fromStringToDocument(java.lang.String s) {
    return org.bson.Document.parse(s);
}