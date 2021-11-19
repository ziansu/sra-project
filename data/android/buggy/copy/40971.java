protected boolean sendUnregisterRequest(org.github.sipuada.SipuadaApi.RegistrationCallback callback, java.lang.String... expiredAddresses) {
    return sendRegisterRequest(callback, true, expiredAddresses);
}