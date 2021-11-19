public java.lang.String deleteAction() {
    com.ozpathway.sw.erms.service.ExpenseReportManager reportManager = getReportManager();
    reportManager.doRemoveUserReport(getLoginUser().getId(), getReport(), this.contract);
    return "deleteReport";
}