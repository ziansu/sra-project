public java.util.List<com.thoughtworks.lean.sonar.aggreagtedreport.model.TestScenarioDto> getScenarios(com.thoughtworks.lean.sonar.aggreagtedreport.model.TestType type) {
    return this.details.getOrDefault(type, java.util.Collections.<com.thoughtworks.lean.sonar.aggreagtedreport.model.TestScenarioDto>emptyList());
}