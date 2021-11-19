@java.lang.Override
public void onScrolled(android.support.v7.widget.RecyclerView recyclerView, int dx, int dy) {
    super.onScrolled(recyclerView, dx, dy);
    if (dy > 0) {
        mViewModel.hideLayoutFooter();
        return ;
    }
    mViewModel.showLayoutFooter();
}