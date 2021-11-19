@java.lang.Override
public com.Ntut.event.EventAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View contactView = android.view.LayoutInflater.from(context).inflate(R.layout.event_item, parent, false);
    com.Ntut.event.EventAdapter.ViewHolder viewHolder = new com.Ntut.event.EventAdapter.ViewHolder(contactView);
    return viewHolder;
}