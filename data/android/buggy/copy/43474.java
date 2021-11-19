@java.lang.Override
public void onPause() {
    super.onPause();
    if ((fragment.fav.chattingAdapter) != null) {
        fragment.fav.chattingUsers.clear();
        fragment.fav.chattingAdapter.notifyDataSetChanged();
    }
    fragment.fav.deatchChatDb();
}