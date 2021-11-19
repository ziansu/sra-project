private void setupDayTab() {
    java.lang.System.out.println("Setup day tab");
    clearTimeSlots();
    try {
        java.lang.System.out.println("get cells");
        getCells();
    } catch (java.text.ParseException e) {
        e.printStackTrace();
    }
    insertCells();
    enterCells();
}