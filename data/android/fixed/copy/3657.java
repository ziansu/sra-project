@org.jetbrains.annotations.NotNull
private com.jaspersoft.android.sdk.service.report.ReportExport performExport(com.jaspersoft.android.sdk.service.report.RunExportCriteria criteria) throws com.jaspersoft.android.sdk.service.exception.ServiceException {
    com.jaspersoft.android.sdk.network.entity.export.ExportExecutionDescriptor exportDetails = runExport(criteria);
    waitForExportReadyStatus(exportDetails);
    com.jaspersoft.android.sdk.network.entity.execution.ReportExecutionDescriptor currentDetails = requestExecutionDetails();
    return mExportFactory.create(criteria, currentDetails, exportDetails);
}