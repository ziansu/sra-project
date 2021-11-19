@java.lang.Override
public VH onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    return (decoratedAdapter) == null ? null : decoratedAdapter.onCreateViewHolder(parent, viewType);
}