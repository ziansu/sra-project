@java.lang.Override
public void onItemRangeChanged(int positionStart, int itemCount, java.lang.Object payload) {
    mWrapAdapter.getAdapter().notifyItemRangeChanged(positionStart, itemCount, payload);
}