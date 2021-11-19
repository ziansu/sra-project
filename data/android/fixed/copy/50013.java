@java.lang.Override
public com.android.news24x7.adapter.NewsRecyclerViewAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int viewType) {
    view = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.news_list, viewGroup, false);
    return new com.android.news24x7.adapter.NewsRecyclerViewAdapter.ViewHolder(view);
}