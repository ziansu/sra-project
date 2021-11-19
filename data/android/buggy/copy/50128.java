public void setItemSize(int columnWidth) {
    if ((mItemSize) == columnWidth) {
        return ;
    }
    mItemSize = columnWidth;
    mItemLayoutParams = new android.widget.GridView.LayoutParams(mItemSize, mItemSize);
    notifyDataSetChanged();
}