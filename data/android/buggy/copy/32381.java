@javax.annotation.PostConstruct
public void execute() throws java.io.IOException {
    copyConfigurationFilesFromClasspath("etc/conf");
    copyConfigurationFilesFromClasspath("META-INF/properties");
}