protected void onLoginSubmit() {
    if (org.apache.commons.lang3.StringUtils.isNotEmpty(loginUsername)) {
        signInAndContinue(loginUsername, loginPassword);
    }
}