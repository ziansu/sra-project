public void saveCredentials(java.lang.String username, java.lang.String password) {
    com.github.rtoshiro.secure.SecureSharedPreferences.Editor editor = com.boundlessgeo.spatialconnect.services.SCAuthService.settings.edit();
    editor.putString("username", username);
    editor.putString("password", password);
    editor.commit();
}