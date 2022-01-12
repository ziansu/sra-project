public void deleteItem(com.codepath.simpletodo.Item item) {
    com.codepath.simpletodo.Item deletedItem = new com.codepath.simpletodo.Item(item.getId(), item.getText());
    deletedItem.delete();
}