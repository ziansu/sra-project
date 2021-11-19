private void setupDayTab() {
    clearTimeSlots();
    try {
        getCells();
    } catch (java.text.ParseException e) {
        e.printStackTrace();
    }
    insertCells();
    enterCells();
}