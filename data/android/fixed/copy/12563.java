@java.lang.Override
public void configure() {
    if ((pluginManager) != null) {
        pluginManager.getPluginConfiguration().setConfiguration(com.constellio.model.entities.modules.ConstellioPlugin.class, "singletonInitializeMode", "true");
    }
}