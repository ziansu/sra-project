protected boolean hasMoreData() {
    return ((getTotalCount()) > 0) && ((getItemCount()) < (getTotalCount()));
}