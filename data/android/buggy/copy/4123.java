public void createLoginSession(java.lang.String userId, java.lang.String email) {
    spEditor.putString(com.leicesterCampus.registrationandlogin.Session.KEY_MAIL, email);
    spEditor.putString(com.leicesterCampus.registrationandlogin.Session.KEY_ID, userId);
    spEditor.commit();
}