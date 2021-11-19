public static boolean getBoolFromExcelCell(org.apache.poi.ss.usermodel.Cell cell) {
    boolean ret = false;
    try {
        ret = cell.getBooleanCellValue();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return ret;
}