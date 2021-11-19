public static int retrieveCompanyId(android.content.Context context) {
    com.reminisense.fa.models.LoginResult loginResult = com.reminisense.fa.managers.CacheManager.retrieveLoginResult(context);
    return loginResult == null ? null : loginResult.getCompanyId();
}