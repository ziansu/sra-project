private boolean isSkipped(net.serenitybdd.jbehave.Meta metaData) {
    return (metaData.hasProperty(net.serenitybdd.jbehave.SerenityReporter.WIP)) || (metaData.hasProperty(net.serenitybdd.jbehave.SerenityReporter.SKIP));
}