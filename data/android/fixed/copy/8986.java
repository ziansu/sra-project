public com.smoke.dto.SmokeHttpWrapperDTO[] prepareForLaunch(org.apache.poi.xssf.usermodel.XSSFWorkbook workBook) {
    int numberOfSheets = workBook.getNumberOfSheets();
    return prepareRequestFromSheet(workBook.getSheetAt(0));
}