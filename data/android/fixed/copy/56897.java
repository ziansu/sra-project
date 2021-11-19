@java.lang.Override
protected void ItemViewClickListener(android.support.v7.widget.RecyclerView.ViewHolder holder, int position) {
    if (((touchItemHolder) != null) && (position != 0))
        touchItemHolder.SingleChoose(holder, getSection(position), position);
    
}