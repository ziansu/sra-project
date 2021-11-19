@java.lang.Override
public void onResume() {
    super.onResume();
    fragment.fav.attachChatUsersDb();
}