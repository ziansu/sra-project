@java.lang.Override
public int getItemViewType(int position) {
    return (decoratedAdapter) == null ? 0 : decoratedAdapter.getItemViewType(position);
}