@java.lang.Override
public void onRestoreInstanceState(android.os.Parcelable state) {
    if (((mRecyclerView) != null) && (state != null)) {
        mRecyclerView.getLayoutManager().onRestoreInstanceState(state);
    }else {
        super.onRestoreInstanceState(state);
    }
}