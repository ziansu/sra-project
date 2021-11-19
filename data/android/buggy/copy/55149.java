@java.lang.Override
public void configure(java.lang.String api_key_value) {
    isProperlyConfigured = false;
    appsgate.lig.tts.yakitome.impl.YakitomeAPIClient.isAvailable = false;
    if (api_key_value != null) {
        this.api_key_value = api_key_value;
    }
    testService();
}