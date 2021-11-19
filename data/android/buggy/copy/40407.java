public static void list() {
    models.datatable.DisasterRecoveryDataTable dataTable = controllers.infra.DisasterRecovery.createDisasterRecoveryDataTable();
    boolean showPauseButton = false;
    java.lang.String localSiteUuid = util.DisasterRecoveryUtils.getLocalUuid();
    render(dataTable, showPauseButton, localSiteUuid);
}