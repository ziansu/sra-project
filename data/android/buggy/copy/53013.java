@org.junit.Test
public void findAllTest() throws java.lang.Exception {
    java.util.Set<io.gravitee.repository.management.model.Api> apis = apiRepository.findAll();
    org.junit.Assert.assertNotNull(apis);
    org.junit.Assert.assertFalse("Fail to resolve api in findAll", apis.isEmpty());
}