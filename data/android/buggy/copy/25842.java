public void hasReceivedGetRequest() {
    org.junit.Assert.assertThat(receivedGETRequest, org.hamcrest.Matchers.is(org.hamcrest.CoreMatchers.equalTo(true)));
}