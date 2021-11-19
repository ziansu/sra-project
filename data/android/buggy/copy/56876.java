public java.lang.String getAutoResponseToSmsTemplate() {
    return this.sharedPreferencesUtility.getStringValue(com.medziku.motoresponder.logic.Settings.AUTO_RESPONSE_TO_SMS_TEMPLATE, this.getDefaultStringValue(com.medziku.motoresponder.logic.Settings.AUTO_RESPONSE_TO_SMS_TEMPLATE));
}