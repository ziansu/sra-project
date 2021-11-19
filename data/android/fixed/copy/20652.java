public java.util.List<com.thoughtworks.lean.sonar.aggreagtedreport.model.TestScenarioDto> getScenarios(com.thoughtworks.lean.sonar.aggreagtedreport.model.TestType type) {
    return getOrDefault(type, java.util.Collections.<com.thoughtworks.lean.sonar.aggreagtedreport.model.TestScenarioDto>emptyList());
}