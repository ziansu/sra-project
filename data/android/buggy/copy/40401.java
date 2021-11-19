public hudson.plugins.klaros.ResultSet[] getResultSets() {
    migratePathTestResults();
    return resultSets.clone();
}