@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View v, int position, long id) {
    mAction = mAdapter.getItem(position);
    updateListToShowCurrentAction();
    return ;
}