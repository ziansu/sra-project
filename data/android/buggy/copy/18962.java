public void deleteMessage(net.ratmole.apps.mqtt.Message message) {
    java.lang.String id = message.getId();
    java.lang.System.out.println(("Message deleted with id: " + id));
    database.delete(MySQLiteHelper.TABLE_MESSAGES, (((MySQLiteHelper.COLUMN_ID) + " = ") + id), null);
}