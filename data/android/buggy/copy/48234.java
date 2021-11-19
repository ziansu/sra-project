@org.junit.Test
public void testGetDiffImageNotFoundTarget() {
    javax.servlet.http.HttpServletResponse response = org.mockito.Mockito.mock(javax.servlet.http.HttpServletResponse.class);
    this.imageController.getDiffImage(0, (-1), 0, 0, response);
    org.mockito.Mockito.verify(response).setStatus(HttpServletResponse.SC_NOT_FOUND);
}