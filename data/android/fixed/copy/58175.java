public static GUI.Configurations getInstance() {
    if ((GUI.Configurations.ourConfigs) == null) {
        GUI.Configurations.ourConfigs = new GUI.Configurations();
    }
    return GUI.Configurations.ourConfigs;
}