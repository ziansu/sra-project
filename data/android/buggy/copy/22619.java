@java.lang.Override
public net.validcat.fishing.adapters.ThingsAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    net.validcat.fishing.adapters.ThingsAdapter.ViewHolder holder = new net.validcat.fishing.adapters.ThingsAdapter.ViewHolder(android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.things_list_item, parent, false));
    return holder;
}