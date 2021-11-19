@java.lang.Override
public com.swerly.wifiheatmap.views.HeatmapDataViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View v = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.card_heatmap, parent, false);
    com.swerly.wifiheatmap.views.HeatmapDataViewHolder heatmapDataViewHolder = new com.swerly.wifiheatmap.views.HeatmapDataViewHolder(listener, v);
    return heatmapDataViewHolder;
}