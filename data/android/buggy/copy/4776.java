@org.junit.Test
public void existingUserNOT_OK_PW() {
    boolean result = auth.authenticateUser("Ole", "fido", 0);
    assertThat(result, org.hamcrest.CoreMatchers.is(true));
}