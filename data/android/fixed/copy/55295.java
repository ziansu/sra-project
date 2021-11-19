public void addTag(com.thoughtworks.lean.sonar.aggreagtedreport.model.TestType testType) {
    if ((this.details.get(testType)) == null) {
        this.details.put(testType, com.google.common.collect.Lists.<com.thoughtworks.lean.sonar.aggreagtedreport.model.TestScenarioDto>newArrayList());
    }
}