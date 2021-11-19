@java.lang.Override
public com.claimant.dev.wheresmybus.adapter.PlatformGridRecyclerViewAdapter.ItemViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View itemView = null;
    itemView = android.view.LayoutInflater.from(mContext).inflate(R.layout.item_platform_grid, parent, false);
    return new com.claimant.dev.wheresmybus.adapter.PlatformGridRecyclerViewAdapter.ItemViewHolder(itemView);
}