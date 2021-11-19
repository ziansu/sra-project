private void settingChanged(java.lang.String setting, int type, java.lang.Object value) {
    for (chatty.util.settings.SettingChangeListener listener : listeners) {
        listener.settingChanged(setting.toLowerCase(), type, value);
    }
}