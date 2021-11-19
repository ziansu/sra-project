private static java.lang.String getName(org.jetbrains.plugins.cucumber.java.run.ScenarioOutline outline) {
    return escape(("Scenario Outline: " + (outline.getName())));
}