public void configurationChanged(org.apache.commons.configuration.event.ConfigurationEvent configurationEvent) {
    ru.mrekin.sc.launcher.core.SettingsManager.log(("Changed property: " + (configurationEvent.getPropertyName())));
}