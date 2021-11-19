@java.lang.Override
public void onRestoreInstanceState(android.os.Parcelable state) {
    super.onRestoreInstanceState(state);
    if (((mRecyclerView) != null) && (state != null)) {
        mRecyclerView.getLayoutManager().onRestoreInstanceState(state);
    }
}