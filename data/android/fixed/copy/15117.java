@java.lang.Override
public boolean apply(@javax.annotation.Nullable
org.sonar.api.platform.PluginMetadata input) {
    return (input != null) && (!(input.isCore()));
}