public void loadOverview() {
    IncidentHolder.setIncident(lvIncidenten.getSelectionModel().getSelectedItem().getDescription());
    StageController.loadStage(View.overviewScene, IncidentHolder.getIncident());
}