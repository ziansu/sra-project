public void deleteMessage(java.lang.String id) {
    java.lang.System.out.println(("Message deleted with id: " + id));
    database.delete(MySQLiteHelper.TABLE_MESSAGES, (((MySQLiteHelper.COLUMN_ID) + " = ") + id), null);
}