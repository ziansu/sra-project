@org.junit.Test
public void findByIdTest() throws java.lang.Exception {
    java.util.Optional<io.gravitee.repository.management.model.Application> optional = applicationRepository.findById("application-sample");
    assertTrue("Find application by name return no result ", optional.isPresent());
}