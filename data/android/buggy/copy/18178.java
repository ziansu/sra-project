public void parseSheet(java.util.Map<java.lang.String, org.apache.poi.xssf.usermodel.XSSFSheet> shIdMap, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet ctSheet) {
    if (org.apache.poi.xssf.streaming.examples.HybridStreaming.SHEET_TO_STREAM.equals(ctSheet.getName())) {
        return ;
    }
}