@org.junit.Test(expected = javax.ws.rs.BadRequestException.class)
public void construct_throwsExceptionWhenPageSizeIsZero() {
    new uk.gov.register.presentation.resource.Pagination(java.util.Optional.of(1L), java.util.Optional.of(0L), 10);
}