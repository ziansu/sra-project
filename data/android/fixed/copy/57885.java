public void initSwipeListener() {
    android.support.v7.widget.helper.ItemTouchHelper.Callback vSwipeCallback = new za.co.dvt.taskify.utils.TaskSwipeHelper(mListAdapter, this);
    android.support.v7.widget.helper.ItemTouchHelper vHelper = new android.support.v7.widget.helper.ItemTouchHelper(vSwipeCallback);
    vHelper.attachToRecyclerView(rcToDOItems);
}