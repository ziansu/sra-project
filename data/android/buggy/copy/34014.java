@org.junit.Test(expected = com.google.maps.errors.NotFoundException.class)
public void testNotFound() throws java.lang.Exception {
    com.google.maps.model.DirectionsRoute[] routes = gpDirectionsService.getDirections("sdjfhsjfhsjf", "sjdfhjsdf7w7r").await();
}