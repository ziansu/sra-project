@java.lang.Override
public com.jaspersoft.android.sdk.service.report.Status perform(java.lang.String token) throws com.jaspersoft.android.sdk.network.HttpException, java.io.IOException {
    com.jaspersoft.android.sdk.network.entity.execution.ExecutionStatus exportStatus = mExportApi.checkExportExecutionStatus(token, executionId, exportId);
    return com.jaspersoft.android.sdk.service.report.Status.wrap(exportStatus.getStatus());
}