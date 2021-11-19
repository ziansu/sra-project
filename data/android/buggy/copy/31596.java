@org.junit.Test
public void findByIdsTest() throws java.lang.Exception {
    java.util.Set<io.gravitee.repository.management.model.Application> apps = applicationRepository.findByIds(java.util.Arrays.asList("searched-app1", "searched-app2"));
    org.junit.Assert.assertNotNull(apps);
    org.junit.Assert.assertEquals(2, apps.size());
}