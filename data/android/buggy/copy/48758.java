@org.junit.Test(expected = javax.ws.rs.NotFoundException.class)
public void construct_throwsNotFoundException_whenNoMoreEntriesForGivenPageSizeAndPageIndexValues() {
    new uk.gov.register.presentation.resource.Pagination("/entries", java.util.Optional.of(2L), java.util.Optional.of(10L), 10);
}