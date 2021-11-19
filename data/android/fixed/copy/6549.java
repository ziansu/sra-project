@java.lang.Override
public java.lang.String apply(@javax.annotation.Nullable
org.sonar.api.platform.PluginMetadata input) {
    if (input == null) {
        return null;
    }
    return input.getName();
}