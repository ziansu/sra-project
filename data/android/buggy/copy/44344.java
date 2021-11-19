public void saveConfig(org.motechproject.commcare.config.Config config) {
    if (!(contains(config))) {
        configs.add(config);
        config.setSaved(true);
    }
}