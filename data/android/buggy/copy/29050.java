public org.apache.poi.ss.usermodel.Cell process(org.hellojavaer.poi.excel.utils.write.ExcelWriteContext<org.hellojavaer.poi.excel.utils.TestBean> context, org.hellojavaer.poi.excel.utils.TestBean t, org.apache.poi.ss.usermodel.Cell cell) {
    if ((t.getEnumField1()) == null) {
        cell.setCellValue("Please select");
    }
    return cell;
}