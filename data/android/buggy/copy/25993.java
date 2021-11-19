public void updateSingleRow(java.lang.String editContent, int index) {
    mTodos.set(index, new com.example.alecksjohanssen.todoapp.DataModel.Todo(editContent));
    adapter.notifyItemChanged(index);
}