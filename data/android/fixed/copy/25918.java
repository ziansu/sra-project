@org.junit.Test
public void shouldNotFindApplicationByName() throws java.lang.Exception {
    java.util.Set<io.gravitee.repository.management.model.Application> apps = applicationRepository.findByName("unknowd-app");
    assertNotNull(apps);
    assertEquals(0, apps.size());
}