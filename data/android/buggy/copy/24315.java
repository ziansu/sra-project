@java.lang.Override
public int getItemCount() {
    int nativeCount = mNativeAdapter.getItemCount();
    mNativeItemEmpty = nativeCount == 0;
    int wrapCount = ((mEmtpyView) != null) ? ptra.hacc.cc.ptr.refreshview.URecyclerView.WrapAdapter.WRAP_ITEM_COUNT : 0;
    return mNativeItemEmpty ? wrapCount : nativeCount;
}