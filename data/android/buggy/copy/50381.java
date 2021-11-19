public boolean isResponderEnabled() {
    return this.sharedPreferencesUtility.getBooleanValue(com.medziku.motoresponder.logic.Settings.RESPONDER_ENABLED, this.getDefaultBooleanValue(com.medziku.motoresponder.logic.Settings.RESPONDER_ENABLED));
}