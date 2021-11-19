@java.lang.Override
public final boolean remove(T item) {
    int position = getPosition(item);
    if (itemList.remove(item)) {
        de.aw.awlib.adapters.AWItemListAdapter.notifyItemRemoved(position);
        removedItemList.add(item);
        return true;
    }
    return false;
}