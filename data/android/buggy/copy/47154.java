public static boolean PlayerClassExists(java.lang.String className) {
    return tk.martijn_heil.kingdomkits.model.PlayerClass.config.getConfigurationSection("classes.classes").getKeys(false).contains(className);
}