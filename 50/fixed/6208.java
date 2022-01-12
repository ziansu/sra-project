public void removeFirstItem() {
    mAllDatas.remove(0);
    com.rsen.base.RBaseAdapter.notifyItemRemoved(0);
}