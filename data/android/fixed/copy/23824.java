public void setOnListItemLongClickListener(com.yydcdut.sdlv.SlideAndDragListView.OnListItemLongClickListener listener) {
    mOnListItemLongClickListener = listener;
    super.setOnItemLongClickListener(this);
}