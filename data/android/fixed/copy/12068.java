@org.junit.Test(expected = javax.ws.rs.BadRequestException.class)
public void construct_throwsExceptionWhenPageIndexIsZero() {
    new uk.gov.register.presentation.resource.Pagination(java.util.Optional.of(0L), java.util.Optional.of(1L), 10);
}