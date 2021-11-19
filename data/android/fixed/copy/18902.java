@org.junit.Test
public void shouldNotFindByUnknownId() throws io.gravitee.repository.exceptions.TechnicalException {
    java.util.Optional<io.gravitee.repository.management.model.Group> group = groupRepository.findById("unknown");
    assertNotNull(group);
    assertFalse(group.isPresent());
}