@java.lang.Override
public void run() {
    com.kakao.usermgmt.UserManagement.requestLogout(new com.kakao.usermgmt.callback.LogoutResponseCallback() {
        @java.lang.Override
        public void onCompleteLogout() {
            android.util.Log.v(com.lihak.plugin.kakao.KakaoTalk.LOG_TAG, "kakao : onCompleteLogout");
            callbackContext.success();
        }
    });
}