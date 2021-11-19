@java.lang.Override
public in.tosc.digitaloceanapp.adapters.DropletsAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View itemView = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.single_droplet, parent, false);
    return new in.tosc.digitaloceanapp.adapters.DropletsAdapter.ViewHolder(itemView);
}