public static java.util.HashMap<java.lang.String, java.lang.String> filterDoc(java.lang.String fileName) {
    java.lang.String docContent = com.excelsecu.axml.dbbuilder.AndroidDocFilter.readDoc(fileName);
    java.util.HashMap<java.lang.String, java.lang.String> attrToMethodList = com.excelsecu.axml.dbbuilder.AndroidDocFilter.filter(docContent);
    return attrToMethodList;
}