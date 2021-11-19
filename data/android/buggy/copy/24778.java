public com.yarolegovich.discretescrollview.ViewHolder getViewHolder(int position) {
    return getChildViewHolder(layoutManager.findViewByPosition(position));
}