public void setEndTime(parser.DateGroup group, java.util.List<java.util.Date> dates) {
    endDateToCalendar(dates.get(0));
    if (group.isTimeInferred()) {
        setEndDateTimeDefault();
    }
}