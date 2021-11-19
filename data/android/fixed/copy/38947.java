org.apache.poi.xssf.streaming.SXSSFSheet createAndRegisterSXSSFSheet(org.apache.poi.xssf.usermodel.XSSFSheet xSheet) {
    final org.apache.poi.xssf.streaming.SXSSFSheet sxSheet;
    try {
        sxSheet = new org.apache.poi.xssf.streaming.SXSSFSheet(this, xSheet);
    } catch (java.io.IOException ioe) {
        throw new java.lang.RuntimeException(ioe);
    }
    registerSheetMapping(sxSheet, xSheet);
    return sxSheet;
}