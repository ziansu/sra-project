@java.lang.Override
public void describe(final org.sonar.api.batch.sensor.SensorDescriptor descriptor) {
    descriptor.name("jDepend sensor");
    descriptor.onlyOnLanguage(Rules.LANGUAGE_JAVA);
    descriptor.createIssuesForRuleRepositories(Rules.REPOSITORY);
}