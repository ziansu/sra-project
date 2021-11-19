private android.content.res.ThemeConfig getThemeConfig() {
    android.content.res.Configuration config = getConfiguration();
    if (config != null) {
        return config.themeConfig;
    }
    return null;
}