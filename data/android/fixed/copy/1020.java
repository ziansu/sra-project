@java.lang.Override
public void onResume() {
    super.onResume();
    users = new java.util.ArrayList<>();
    for (client.smrtms.com.smrtms_client.controller.User friend : client.smrtms.com.smrtms_client.controller.LoginUser.getInstance().getFriendList()) {
        users.add(friend);
    }
}