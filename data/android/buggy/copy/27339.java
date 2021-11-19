org.apache.poi.xssf.usermodel.XSSFSheet getXSSFSheet(org.apache.poi.xssf.streaming.SXSSFSheet sheet) {
    org.apache.poi.xssf.usermodel.XSSFSheet result = _sxFromXHash.get(sheet);
    return result;
}