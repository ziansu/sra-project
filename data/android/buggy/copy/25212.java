@java.lang.Override
public void onItemLongClick(android.support.v7.widget.RecyclerView parent, android.view.View clickedView, int position) {
    com.marshalchen.ultimaterecyclerview.Logs.d("", "onItemLongClick()");
    toolbar.startActionMode(this);
    toggleSelection(position);
    dragDropTouchListener.startDrag();
    ultimateRecyclerView.enableSwipeRefresh(false);
}