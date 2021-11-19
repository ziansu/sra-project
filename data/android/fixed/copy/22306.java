private void newItemBtnActionPerformed(java.awt.event.ActionEvent evt) {
    java.util.Date date = new java.util.Date();
    com.mrjaffesclass.apcs.todolist.ToDoItem item = new com.mrjaffesclass.apcs.todolist.ToDoItem((-1), "New to do item", false, date);
    editItem(item);
}