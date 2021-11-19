private static java.lang.String getName(org.jetbrains.plugins.cucumber.java.run.Step step) {
    return org.jetbrains.plugins.cucumber.java.run.CucumberJvmSMFormatter.escape((((step.getKeyword()) + " ") + (step.getName())));
}