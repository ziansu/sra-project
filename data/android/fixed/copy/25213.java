public void removeItem(com.demo.kuanyi.todolist.model.ListItemTable itemTable) {
    int position = mListItemTableList.indexOf(itemTable);
    notifyItemRemoved(position);
    mListItemTableList.remove(position);
    notifyAdapterSizeChange();
}