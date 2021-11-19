@java.lang.Override
public int getItemViewType(int position) {
    int type;
    if (mNativeItemEmpty) {
        type = ptra.hacc.cc.ptr.refreshview.URecyclerView.WrapAdapter.EMPTY_TYPE;
    }else {
        type = mNativeAdapter.getItemViewType(position);
    }
    return type;
}