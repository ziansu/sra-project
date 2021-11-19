@java.lang.Override
public int getItemCount() {
    if ((mAdapter) != null) {
        return (getFootersCount()) + (mAdapter.getItemCount());
    }else {
        return getFootersCount();
    }
}