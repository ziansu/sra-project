@org.junit.Test
public void doesNotPrefixQualifiedRelsForRelAsString() {
    org.junit.Assert.assertThat(provider.getNamespacedRelFor("custom:rel"), org.hamcrest.CoreMatchers.is("custom:rel"));
}