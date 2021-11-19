public void initSwipeListener() {
    android.support.v7.widget.helper.ItemTouchHelper.Callback vSwipeCallback = new za.co.dvt.taskify.utils.TaskSwipeHelper(mListAdapter, getApplicationContext());
    android.support.v7.widget.helper.ItemTouchHelper vHelper = new android.support.v7.widget.helper.ItemTouchHelper(vSwipeCallback);
    vHelper.attachToRecyclerView(rcToDOItems);
}