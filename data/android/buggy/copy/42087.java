public void startMain() {
    android.content.Intent intent = new android.content.Intent(activity, com.fu.group10.capstone.apps.teachermobileapp.activity.ListRoomActivity.class);
    intent.putExtra("username", username);
    startActivity(intent);
    activity.finish();
}