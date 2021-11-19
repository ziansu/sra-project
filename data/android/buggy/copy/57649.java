private static java.util.LinkedList<java.lang.String> getSeparateFields(java.lang.String fileLineContent) {
    java.util.LinkedList<java.lang.String> separatedContents = new java.util.LinkedList<java.lang.String>(java.util.Arrays.asList(fileLineContent.split(Storage.TAGS_LINE_FIELD_SEPARATOR)));
    return separatedContents;
}