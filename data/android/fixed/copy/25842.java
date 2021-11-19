public void hasReceivedGetRequest() {
    assertThat(receivedGETRequest, org.hamcrest.Matchers.is(org.hamcrest.CoreMatchers.equalTo(true)));
}