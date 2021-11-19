@java.lang.Override
public com.vathsav.blink.model.LogViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View layout = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.card_log, parent);
    return new com.vathsav.blink.model.LogViewHolder(layout, context);
}