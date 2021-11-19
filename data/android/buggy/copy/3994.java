@java.lang.Override
public void onRefresh() {
    com.github.jdsjlzx.util.RecyclerViewStateUtils.setFooterViewState(mRecyclerView, LoadingFooter.State.Normal);
    mDataAdapter.clear();
    mLRecyclerViewAdapter.notifyDataSetChanged();
    com.lzx.demo.ui.SwipeDeleteActivity.mCurrentCounter = 0;
    isRefresh = true;
    requestData();
}