@org.junit.Test
public void deleteUser() throws java.lang.Exception {
    javax.ws.rs.core.Response response = webTarget.path(((RESOURCE_PATH) + "/1")).request().delete();
    assertEquals(200, response.getStatus());
}