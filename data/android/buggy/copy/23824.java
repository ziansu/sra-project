public void setOnListItemLongClickListener(com.yydcdut.sdlv.SlideAndDragListView.OnListItemLongClickListener listener) {
    mOnListItemLongClickListener = listener;
    if ((mOnListItemLongClickListener) == null) {
        super.setOnItemLongClickListener(null);
    }else {
        super.setOnItemLongClickListener(this);
    }
}