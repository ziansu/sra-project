public void deleteItem(com.codepath.simpletodo.Item item) {
    com.codepath.simpletodo.Item deletedItem = com.raizlabs.android.dbflow.sql.language.SQLite.select().from(com.codepath.simpletodo.Item.class).where(Item_Table.id.eq(item.id)).querySingle();
    deletedItem.delete();
}