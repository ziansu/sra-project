@java.lang.Override
public void onApplicationEvent(org.springframework.cloud.context.environment.EnvironmentChangeEvent event) {
    if ((environment) == null) {
        return ;
    }
    org.springframework.boot.logging.LoggingSystem system = org.springframework.boot.logging.LoggingSystem.get(org.springframework.boot.logging.LoggingSystem.class.getClassLoader());
    setLogLevels(system, environment);
}