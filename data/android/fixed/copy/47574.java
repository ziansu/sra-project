public final void destroy() {
    animViewList.clear();
    if ((animDisposable) != null) {
        animDisposable.dispose();
        animDisposable = null;
    }
    animObservableList.clear();
    prevScrollEvent = tech.thdev.androidrecyclerview.view.scroll.anim.OnRecyclerScrollListener.SCROLL_NONE;
}