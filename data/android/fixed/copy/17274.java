@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), cn.an0nymous.chatroom.Activity.SignupActivity.class);
    startActivity(intent);
    overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
}