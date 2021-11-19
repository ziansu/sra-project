public double getCellAsDouble(java.lang.String cellName) {
    org.apache.poi.ss.excelant.util.Cell cell = getCell(cellName);
    if (cell != null) {
        return cell.getNumericCellValue();
    }
    return 0.0;
}