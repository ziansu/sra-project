@org.junit.Test
public void testGetFromEmpty() {
    org.junit.Assert.assertThat(parametersEmpty.get(key), org.hamcrest.CoreMatchers.is(org.hamcrest.CoreMatchers.nullValue()));
}