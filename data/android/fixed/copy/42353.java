private void setSnapshotIdAndGroupId(com.samsung.sec.dexter.core.analyzer.AnalysisConfig config) {
    if ("SNAPSHOT".equals(projectCfg.getType())) {
        config.setSnapshotId(java.lang.System.currentTimeMillis());
    }
}