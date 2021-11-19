private void clearTable() {
    tableModel.setRowCount(0);
    com.ojdbc.rmqhelper.rmq.DefaultConsumer.resetSeq();
}