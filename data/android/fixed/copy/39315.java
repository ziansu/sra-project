@org.junit.Test
public void testGetDiffImageNotFoundSource() {
    javax.servlet.http.HttpServletResponse response = mock(javax.servlet.http.HttpServletResponse.class);
    this.imageController.getDiffImage((-1), 0, 0, 0, response);
    verify(response).setStatus(HttpServletResponse.SC_NOT_FOUND);
}