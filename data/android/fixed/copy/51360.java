@org.junit.Test
public void shouldReturnNoRoutesIfTheStopDoesNotExist() throws java.lang.Exception {
    java.util.Optional<java.util.Set<java.lang.Integer>> routesAtStation = this.routesAtStation.get(3333);
    org.junit.Assert.assertThat(routesAtStation.isPresent(), org.hamcrest.core.Is.is(false));
}