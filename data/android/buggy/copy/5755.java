@java.lang.Override
public io.geeteshk.hyper.adapter.ProjectAdapter.MyViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    java.util.Arrays.sort(mObjects);
    android.view.View itemView = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project, parent, false);
    return new io.geeteshk.hyper.adapter.ProjectAdapter.MyViewHolder(itemView);
}