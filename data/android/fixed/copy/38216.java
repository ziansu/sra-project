@java.lang.Override
protected void onDestroy() {
    com.jess.arms.base.DefaultAdapter.releaseAllHolder(mRecyclerView);
    super.onDestroy();
    this.mRxPermissions = null;
    this.mPaginate = null;
}