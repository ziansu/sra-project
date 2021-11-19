@org.junit.Test
public void returnsEmptyMapOnGetAllScenariosWhenThereAreNone() {
    org.junit.Assert.assertThat(com.github.tomakehurst.wiremock.client.WireMock.getAllScenarios().size(), org.hamcrest.Matchers.is(0));
}