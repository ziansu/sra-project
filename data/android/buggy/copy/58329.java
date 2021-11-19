@java.lang.Override
public void isLoadingMore(boolean loading) {
    if (loading) {
        loadState = STATE_LOADING;
    }else {
        loadState = STATE_DISMISS;
    }
    com.lovejjfg.zhifou.ui.recycleview.RefreshRecycleAdapter.notifyItemChanged(getItemCount());
}