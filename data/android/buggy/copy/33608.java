@java.lang.Override
public void onAuthCreated(com.box.androidsdk.content.auth.BoxAuthentication.BoxAuthenticationInfo info) {
    com.demo.dropboxupload.utils.Preferences.setPreference(AppConstants.KEY_BOX_REFRESH_TOKEN, info.refreshToken(), mParentActivity);
    mParentActivity.startFilesActivity(info.accessToken());
}