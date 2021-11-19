public void displayTodayTab() {
    java.util.Calendar today = java.util.Calendar.getInstance();
    int todayWeekday = today.get(java.util.Calendar.DAY_OF_WEEK);
    displayTabByWeekend(todayWeekday);
}