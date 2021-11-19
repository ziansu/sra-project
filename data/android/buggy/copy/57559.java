@org.junit.Test
public void testExists_whenDoesNotExist() {
    boolean expected = false;
    boolean actual = service.exists("somekey");
    org.hamcrest.MatcherAssert.assertThat(actual, org.hamcrest.CoreMatchers.is(expected));
}