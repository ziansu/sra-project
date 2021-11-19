private void assertIsRefResponse(io.swagger.util.Response response, java.lang.String expectedRef) {
    assertTrue((response instanceof io.swagger.util.RefResponse));
    io.swagger.util.RefResponse refResponse = ((io.swagger.util.RefResponse) (response));
    assertEquals(refResponse.get$ref(), expectedRef);
}