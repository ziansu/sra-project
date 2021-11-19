public void notifyDataItemRangeRemoved(int positionStart, int itemCount) {
    java.lang.System.out.println(((("notifyDataItemRangeRemoved " + positionStart) + " ") + itemCount));
    super.notifyItemRangeRemoved(((getHeaderCount()) + positionStart), itemCount);
}