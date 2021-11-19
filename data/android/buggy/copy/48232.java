private void sendMail(java.lang.String newMail) {
    new samurai.geeft.android.geeft.database.BaaSMail(getView(), samurai.geeft.android.geeft.utilities.TagsValue.DEFAULT_EMAIL, samurai.geeft.android.geeft.utilities.TagsValue.DEFAULT_TAG, newMail, mCode).execute();
}