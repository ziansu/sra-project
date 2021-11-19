@java.lang.Override
public boolean apply(org.sonar.api.platform.PluginMetadata input) {
    return !(input.isCore());
}