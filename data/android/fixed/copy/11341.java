@org.junit.Test
public void testGet() {
    org.junit.Assert.assertThat(parameters.get(key), org.hamcrest.CoreMatchers.is(param));
}