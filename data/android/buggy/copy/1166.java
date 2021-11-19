private void init() {
    com.sina.weibo.sdk.WbSdk.install(this, new com.sina.weibo.sdk.auth.AuthInfo(this, com.weapon.joker.lib.middleware.utils.Constants.WEIBO_APP_KEY, com.weapon.joker.lib.middleware.utils.Constants.WEIBO_REDIRECT_URL, com.weapon.joker.lib.middleware.utils.Constants.WEIBO_SCOPE));
}