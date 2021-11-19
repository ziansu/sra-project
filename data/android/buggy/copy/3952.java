@android.support.annotation.NonNull
protected com.github.vivchar.rendererrecyclerviewadapter.RendererRecyclerViewAdapter getAdapter() {
    if ((mAdapter) == null) {
        mAdapter = createAdapter();
    }
    return mAdapter;
}