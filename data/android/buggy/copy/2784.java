public boolean isPremium() {
    return ((getPremiumVersion()) != null) && (getPremiumVersion().equals(com.zohaltech.app.corevocabulary.classes.Helper.hashString(com.zohaltech.app.corevocabulary.classes.Helper.getDeviceId())));
}