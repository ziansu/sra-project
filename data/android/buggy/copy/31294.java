public static void setCalendarWeek(final int firstDayOfWeek, final int minimalDaysInFirstWeek) {
    final java.time.DayOfWeek dow = java.time.DayOfWeek.SUNDAY.plus((firstDayOfWeek - 1));
    net.tourbook.common.time.TimeTools.calendarWeek = java.time.temporal.WeekFields.of(dow, minimalDaysInFirstWeek);
}