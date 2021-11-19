private static java.io.InputStream getJsonStream(java.lang.String strFile) {
    return org.qpt.util.JsonDataParserTest.class.getClassLoader().getResourceAsStream(strFile);
}