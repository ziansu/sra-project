@org.junit.Test
public void shouldFindByGroups() throws java.lang.Exception {
    java.util.Set<io.gravitee.repository.management.model.Application> apps = applicationRepository.findByGroups(java.util.Arrays.asList("application-group"));
    org.junit.Assert.assertNotNull(apps);
    org.junit.Assert.assertEquals(2, apps.size());
}