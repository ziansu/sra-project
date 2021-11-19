private boolean isConnectedAvailable(org.talend.dataquality.properties.TDQAnalysisItem runItem) {
    orgomg.cwm.foundation.softwaredeployment.DataManager datamanager = runItem.getAnalysis().getContext().getConnection();
    return org.talend.cwm.db.connection.ConnectionUtils.checkConnection(datamanager);
}