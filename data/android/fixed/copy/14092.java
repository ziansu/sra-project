@java.lang.Override
public boolean apply(com.github.tomakehurst.wiremock.stubbing.StubMapping input) {
    return scenarioName.equals(input.getScenarioName());
}