private static java.lang.String getName(org.jetbrains.plugins.cucumber.java.run.ScenarioOutline outline) {
    return org.jetbrains.plugins.cucumber.java.run.CucumberJvmSMFormatter.escape(("Scenario Outline: " + (outline.getName())));
}