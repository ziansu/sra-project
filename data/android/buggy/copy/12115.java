@java.lang.Override
public void save(com.timvisee.yamlwrapper.configuration.ConfigurationSection config) {
    config.set("file", file.getAbsolutePath());
}