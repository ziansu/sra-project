@java.lang.Override
public final int getItemViewType(int position) {
    if (position == 0)
        return com.pierfrancescosoffritti.shrinkingimagelayout.HeaderRecyclerViewAdapter.HEADER;
    
    return getItemViewType_((position - 1));
}