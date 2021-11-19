public java.util.List<xstampp.model.AbstractLTLProvider> fetchSafetyConstraintsAs() {
    java.util.List<xstampp.model.AbstractLTLProvider> tempSafetyConstraints = new java.util.ArrayList<xstampp.model.AbstractLTLProvider>();
    tempSafetyConstraints = dataModel.getAllScenarios(false, true, false);
    return tempSafetyConstraints;
}