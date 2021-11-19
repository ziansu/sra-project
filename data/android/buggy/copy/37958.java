@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> arg0, android.view.View view, final int pos, long id) {
    show_edit_pop_up(pos);
    item_list.refreshDrawableState();
    return true;
}