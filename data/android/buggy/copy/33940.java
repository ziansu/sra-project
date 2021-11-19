@org.junit.Test
public void testCreateNewPlan() throws java.lang.Exception {
    com.springfullstackcloudapp.backend.persistence.domains.backend.Plan basicPlan = createplan(PlansEnum.BASIC);
    planRepository.save(basicPlan);
    com.springfullstackcloudapp.backend.persistence.domains.backend.Plan retrievedPlan = planRepository.findOne(com.springfullstackcloudapp.tests.integration.RepositoriesIntegrationTest.BASIC_PLAN_ID);
    org.junit.Assert.assertNotNull(retrievedPlan);
}