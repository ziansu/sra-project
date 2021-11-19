public void loadConfiguration() {
    com.nicodangelo.lumiere.handler.ConfigurationHandler.testValue = com.nicodangelo.lumiere.handler.ConfigurationHandler.configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "this is an example configuration value");
    if (com.nicodangelo.lumiere.handler.ConfigurationHandler.configuration.hasChanged()) {
        com.nicodangelo.lumiere.handler.ConfigurationHandler.configuration.save();
    }
}