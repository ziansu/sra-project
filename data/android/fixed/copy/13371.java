@org.junit.Test
public void testGetImageNotFound() {
    javax.servlet.http.HttpServletResponse response = mock(javax.servlet.http.HttpServletResponse.class);
    this.imageController.getImage((-1), 0, response);
    verify(response).setStatus(HttpServletResponse.SC_NOT_FOUND);
}