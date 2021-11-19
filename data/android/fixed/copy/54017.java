@java.lang.Override
public void reload() {
    try {
        synchronized(varFileConfig) {
            varFileConfig.load(varFile);
        }
    } catch (java.io.IOException | org.bukkit.configuration.InvalidConfigurationException e) {
        e.printStackTrace();
    }
}