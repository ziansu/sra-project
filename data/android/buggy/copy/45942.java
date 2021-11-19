@java.lang.Override
public final void onItemDismissed(T item, int position) {
    remove(item);
    de.aw.awlib.adapters.AWItemListAdapter.notifyItemRemoved(position);
    mBinder.onItemDismiss(item, position);
}