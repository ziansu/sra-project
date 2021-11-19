public void notifyDataItemRangeRemoved(int positionStart, int itemCount) {
    super.notifyItemRangeRemoved(((getHeaderCount()) + positionStart), itemCount);
}