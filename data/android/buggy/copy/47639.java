@java.lang.Override
public void onStartDrag(android.support.v7.widget.RecyclerView.ViewHolder viewHolder) {
    mItemTouchHelper.startDrag(viewHolder);
    android.util.Log.e("MyTAG", ahgpoug.qrreader.SelectorActivity.task.getId());
}