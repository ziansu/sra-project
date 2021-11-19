@java.lang.Override
public void onFullLoaded(int position) {
    layoutManager.smoothScrollToPosition(recyclerThreadList, null, position);
}