@org.junit.Test
public void registration() {
    assertNull(getLogin("mike", "123").exec());
    org.flockdata.test.integration.SystemUserResultBean suResult = getDefaultUser();
    assertNotNull(suResult);
    assertNotNull(suResult.getApiKey());
}