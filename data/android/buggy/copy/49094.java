public static boolean canLevelUp(int currentLevel) {
    return ((slimeknights.toolleveling.config.Config.INSTANCE.configFile.general.maximumLevels) > 0) && ((slimeknights.toolleveling.config.Config.INSTANCE.configFile.general.maximumLevels) >= currentLevel);
}