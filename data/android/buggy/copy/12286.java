@java.lang.Override
public void addMapping(com.github.tomakehurst.wiremock.stubbing.StubMapping mapping) {
    mappings.add(mapping);
    scenarios.onStubMappingAddedOrUpdated(mapping);
}