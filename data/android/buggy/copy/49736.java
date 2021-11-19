private void logout() {
    au.com.pactera.pacterapulse.helper.OfficeAuthenticationHelper.logout(context);
    au.com.pactera.pacterapulse.helper.Utils.restartApp(context);
}