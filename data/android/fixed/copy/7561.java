@java.lang.Override
public final int getItemCount() {
    int count = (getAdapterCount()) - (removed);
    return count < 0 ? 0 : count;
}