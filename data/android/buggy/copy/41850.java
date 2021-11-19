@java.lang.Override
public void onSuccess(com.quickblox.auth.model.QBSession result, android.os.Bundle params) {
    com.quickblox.sample.groupchatwebrtc.utils.TokenUtils.saveTokenData();
    creatingSessionCallback.onSuccess(result, params);
}