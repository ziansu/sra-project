@org.junit.Test
public void getAllClients() throws java.lang.Exception {
    assertThat(service.getAllClients(), org.hamcrest.core.Is.is(clientList));
}