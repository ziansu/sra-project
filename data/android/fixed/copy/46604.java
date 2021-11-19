public static void selectDate(java.lang.String userName, int day, int month, int year, java.lang.String calendarName) {
    controllers.Application.selectedDay = day;
    controllers.Application.selectedMonth = month;
    controllers.Application.selectedYear = year;
    controllers.Application.calendar(userName, calendarName, null, (-1));
}