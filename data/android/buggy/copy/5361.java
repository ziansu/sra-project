public void remove(T object) {
    mData.remove(object);
    (mViewCount)--;
    cn.lemon.view.adapter.RecyclerAdapter.notifyItemRemoved(mData.indexOf(object));
}