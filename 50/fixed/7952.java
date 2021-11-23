public nl.mawoo.wcmscript.modules.excel.ExcelExport save(java.lang.String filename) throws java.io.IOException {
    java.io.FileOutputStream outputStream = new java.io.FileOutputStream(new java.io.File(filename));
    workbook.write(outputStream);
    outputStream.close();
    workbook.close();
    return this;
}