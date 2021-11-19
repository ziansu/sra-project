@java.lang.Override
protected void addSystemResources() {
    resources.remove(uk.gov.gchq.gaffer.rest.serialisation.RestJsonProvider.class);
    resources.add(uk.gov.gchq.gaffer.rest.serialisation.ExampleRestJsonProvider.class);
}