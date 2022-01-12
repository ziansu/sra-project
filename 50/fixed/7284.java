private java.lang.String getRegionFromDefaultModelSettings(java.lang.String defaultModelSettingsString) {
    if (defaultModelSettingsString == null) {
        return "";
    }
    org.json.JSONObject defaultModelSettings = new org.json.JSONObject(defaultModelSettingsString);
    return defaultModelSettings.has("region") ? defaultModelSettings.getString("region") : "";
}