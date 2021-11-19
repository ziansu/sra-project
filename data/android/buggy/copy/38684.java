protected org.apache.poi.xssf.usermodel.XSSFCell getCell(int row, int col) {
    return getSheet().getRow(row).getCell(col);
}