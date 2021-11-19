private boolean isSkipped(net.serenitybdd.jbehave.Meta metaData) {
    if (metaData == null)
        return false;
    
    return (metaData.hasProperty(net.serenitybdd.jbehave.SerenityReporter.WIP)) || (metaData.hasProperty(net.serenitybdd.jbehave.SerenityReporter.SKIP));
}