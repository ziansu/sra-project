@org.testng.annotations.Test(dependsOnMethods = { "testGetAdminInfo" }, groups = "query")
public void testQueryActiviesUnderAdmin() {
    java.util.List<com.ipcs.model.Activity> activities = adminService.listAllActivitiesFromAdmin("Person");
    org.testng.Assert.assertTrue(((activities.size()) == 1));
}