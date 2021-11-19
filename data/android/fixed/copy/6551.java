@java.lang.Override
public RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View view = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.dbquerycard, parent, false);
    com.zhangwx.z_utils.Z_DB.DataBaseActivity.DBAdapter.DBViewHolder viewHolder = new com.zhangwx.z_utils.Z_DB.DataBaseActivity.DBAdapter.DBViewHolder(view);
    return viewHolder;
}