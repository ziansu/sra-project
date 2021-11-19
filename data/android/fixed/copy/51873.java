@org.testng.annotations.Test(groups = { "TestClusterHealService" })
public void testGetBadDisks() {
    com.vmware.bdd.service.TestClusterHealService.logger.info("test getBadDisks");
    java.util.List<com.vmware.bdd.spectypes.DiskSpec> badDisks = com.vmware.bdd.service.TestClusterHealService.service.getBadDisks(com.vmware.bdd.service.TestClusterHealService.NODE_1_NAME);
    org.testng.Assert.assertEquals(badDisks.size(), 1, "disk 0 on local-datastore-0 should be bad");
}