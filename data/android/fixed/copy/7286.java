private void validateAuthMode(java.lang.String modeToAdd) {
    if (modeToAdd.equals(ProvidersType.oidc.name())) {
        ensureNoAuthnProvider();
    }else {
        ensureNoIDPProvider();
    }
}