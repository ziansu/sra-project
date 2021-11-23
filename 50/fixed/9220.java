private void changeIdentityPassword(java.util.Map<java.lang.String, java.lang.String> accountsToChangePass) {
    java.lang.String newPassword = accountsToChangePass.remove("Identity");
    identity.setPassword(newPassword);
}