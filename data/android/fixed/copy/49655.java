@org.junit.Test
public void shouldNotFindById() throws io.gravitee.repository.exceptions.TechnicalException {
    java.util.Optional<io.gravitee.repository.management.model.Membership> membership = membershipRepository.findById(null, MembershipReferenceType.API, "api1");
    assertFalse(membership.isPresent());
}