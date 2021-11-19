public static java.lang.String getFormatStringForViewUpwards(java.util.Date date) {
    int month = (date.getMonth()) + 1;
    int year = date.getYear();
    return com.goupwards.util.DateTimeUtils.getDisplayFormatDateFromYearAndMonthForUpward(year, month);
}