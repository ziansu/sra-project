@java.lang.Override
public void onClick(android.view.View view) {
    orderEntries.remove(orderEntries.get(position));
    notifyDataSetChanged();
    businessObjects.SessionInformations.getInstance().setEntry(orderEntries);
}