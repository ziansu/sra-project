public void updatePitBenchData(int projectId) {
    loadRequiredFieldMapping(projectId);
    parsePitAndBenchData(projectId);
    updateDB(projectId);
}