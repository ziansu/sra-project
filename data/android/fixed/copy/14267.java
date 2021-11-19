private boolean isPending(net.serenitybdd.jbehave.Meta metaData) {
    if (metaData == null)
        return false;
    
    return metaData.hasProperty(net.serenitybdd.jbehave.SerenityReporter.PENDING);
}