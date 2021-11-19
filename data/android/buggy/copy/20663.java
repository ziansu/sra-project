@org.junit.BeforeClass
public static void beforeClass() throws java.lang.Exception {
    co.cask.cdap.security.authorization.AuthorizationDatasetTest.dsFrameworkUtil.createInstance("table", co.cask.cdap.security.authorization.AuthorizationDatasetTest.tabInstance.toId(), DatasetProperties.EMPTY);
    co.cask.cdap.security.authorization.AuthorizationDatasetTest.table = new co.cask.cdap.security.authorization.AuthorizationDataset(((co.cask.cdap.api.dataset.table.Table) (co.cask.cdap.security.authorization.AuthorizationDatasetTest.dsFrameworkUtil.getInstance(co.cask.cdap.security.authorization.AuthorizationDatasetTest.tabInstance.toId()))));
}