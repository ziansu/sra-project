public void systemTest() {
    double number = java.lang.System.currentTimeMillis();
    table.putNumber("datatable", number);
    table.addTableListener(key, listener, immediateNotify);
}