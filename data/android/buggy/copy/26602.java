private boolean doSupportTez() {
    if (isHiveDBConnSelected()) {
        org.talend.core.runtime.hd.hive.HiveMetadataHelper.doSupportTez(hiveDistributionCombo.getText(), hiveVersionCombo.getText(), true);
    }
    return false;
}