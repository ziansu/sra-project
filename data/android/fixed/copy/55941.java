public void hasReceivedRequestThatContains(java.lang.String expected) {
    assertThat(lastReceivedRequest, org.hamcrest.Matchers.containsString(expected));
}