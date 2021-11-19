@java.lang.Override
public int getItemCount() {
    int wrapCount = ((mEmtpyView) != null) ? ptra.hacc.cc.ptr.refreshview.URecyclerView.WrapAdapter.WRAP_ITEM_COUNT : 0;
    return mNativeItemEmpty ? wrapCount : mNativeAdapter.getItemCount();
}