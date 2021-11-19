public org.springframework.core.env.PropertySource<?> loadConfiguration(java.lang.String appName, java.lang.String[] profiles) {
    return this.configurationLoader.load(appName, profiles);
}