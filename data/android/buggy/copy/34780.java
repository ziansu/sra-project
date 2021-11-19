private java.util.List<org.impressivecode.depress.mr.googleaudit.GoogleAuditEntryMethodLevel> parseEntriesMethodLevel(final java.lang.String eclipsemetricsFilePath) throws java.io.IOException, javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXException {
    org.impressivecode.depress.mr.googleaudit.GoogleAuditEntriesParser parser = new org.impressivecode.depress.mr.googleaudit.GoogleAuditEntriesParser();
    return parser.parseEntriesMethodLevel(eclipsemetricsFilePath);
}