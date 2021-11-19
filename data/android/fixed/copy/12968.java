@org.junit.Test
public void TestGetProblems() {
    javax.ws.rs.core.Response response = test.java.TestDirlididi.server.newRequest("/problem").request().buildGet().invoke();
    org.junit.Assert.assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
}