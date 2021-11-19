public void setRemovable(int position) {
    T item = mItems.get(position);
    boolean isRemovable = !(item.getCanRemove());
    item.setCanRemove(isRemovable);
    todo.javier.mera.todolist.adapters.RecyclerAdapter.notifyItemChanged(position);
}