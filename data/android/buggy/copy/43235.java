@java.lang.Override
public void onClick(android.view.View v) {
    data.remove(text);
    notifyDataSetChanged();
    closeAllItems();
}