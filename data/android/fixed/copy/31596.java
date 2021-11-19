@org.junit.Test
public void findByIdsTest() throws java.lang.Exception {
    java.util.Set<io.gravitee.repository.management.model.Application> apps = applicationRepository.findByIds(java.util.Arrays.asList("searched-app1", "searched-app2"));
    assertNotNull(apps);
    assertEquals(2, apps.size());
}