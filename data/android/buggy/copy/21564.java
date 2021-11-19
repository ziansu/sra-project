public void handleGcmSuccess(final java.lang.Void unused) {
    this.sharedPreferences.edit().putBoolean(com.toshi.service.RegistrationIntentService.ETH_SERVICE_SENT_TOKEN_TO_SERVER, true).apply();
    com.toshi.service.RegistrationIntentService.registrationSubject.onNext(unused);
}