private static java.io.InputStream getJsonStream(java.lang.String strFile) {
    java.lang.System.out.println(org.qpt.util.JsonDataParserTest.class.getClassLoader().getResource(strFile));
    return org.qpt.util.JsonDataParserTest.class.getClassLoader().getResourceAsStream(strFile);
}