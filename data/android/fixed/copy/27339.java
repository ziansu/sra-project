org.apache.poi.xssf.usermodel.XSSFSheet getXSSFSheet(org.apache.poi.xssf.streaming.SXSSFSheet sheet) {
    return _sxFromXHash.get(sheet);
}