public java.lang.String deleteAction() {
    com.ozpathway.sw.erms.service.ExpenseReportManager reportManager = this.getReportManager();
    reportManager.doRemoveUserReport(this.getLoginUser().getId(), this.getReport(), this.contract);
    return "deleteReport";
}