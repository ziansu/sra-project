public void unregisterNSDService() {
    if ((networkRegistrationListener) != null) {
        mNsdManager.unregisterService(networkRegistrationListener);
        networkRegistrationListener = null;
    }
}