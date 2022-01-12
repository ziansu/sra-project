@java.lang.SuppressWarnings(value = "unchecked")
static java.lang.Iterable<java.lang.Integer> intIterable(java.lang.Integer... values) {
    return ((java.lang.Iterable<java.lang.Integer>) (org.mockito.Matchers.argThat(org.hamcrest.Matchers.contains(values))));
}