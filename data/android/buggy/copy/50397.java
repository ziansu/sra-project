@java.lang.Override
public int getItemCount() {
    return (mOriginalAdapter.getItemCount()) + (mItems.size());
}