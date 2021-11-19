@java.lang.Override
public void onResume() {
    super.onResume();
    if ((fragment.fav.chattingAdapter.objects) != null) {
        fragment.fav.chattingAdapter.objects.clear();
    }
    fragment.fav.attachChatUsersDb();
}