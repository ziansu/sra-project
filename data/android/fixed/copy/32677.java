@java.lang.Override
public void onSuccess(com.quickblox.users.model.QBUser result, android.os.Bundle params) {
    android.util.Log.d(com.quickblox.sample.videochatwebrtcnew.activities.ListUsersActivity.TAG, "onSuccess login to chat with params");
    android.content.Intent intent = new android.content.Intent(this, com.quickblox.sample.videochatwebrtcnew.activities.CallActivity.class);
    intent.putExtra("login", login);
}