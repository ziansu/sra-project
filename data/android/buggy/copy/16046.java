@org.junit.Test
public void prefixesNormalRelsForRelAsString() {
    org.junit.Assert.assertThat(provider.getNamespacedRelFor("book"), org.hamcrest.CoreMatchers.is("acme:book"));
}