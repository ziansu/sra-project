@java.lang.Override
public int getItemViewType(int position) {
    int type;
    if (mNativeItemEmpty) {
        if (position == 0)
            type = ptra.hacc.cc.ptr.refreshview.URecyclerView.WrapAdapter.EMPTY_TYPE;
        else
            type = ptra.hacc.cc.ptr.refreshview.URecyclerView.WrapAdapter.EMPTY_TYPE;
        
    }else {
        type = mNativeAdapter.getItemViewType(position);
    }
    return type;
}