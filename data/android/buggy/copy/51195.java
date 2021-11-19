@java.lang.Override
public void onListItemClick(android.widget.ListView listView, android.view.View view, int position, long id) {
    super.onListItemClick(listView, view, (position - 2), id);
    selectItem(position);
}