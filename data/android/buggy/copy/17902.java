public void markAll() {
    int size = getSize();
    doneList.addAll(todoList);
    todoList.clear();
    super.fireIntervalRemoved(this, 0, size);
}