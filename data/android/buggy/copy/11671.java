public java.lang.String getTotalEndDate() {
    return new java.text.SimpleDateFormat("yyyy-MM-dd").format(endDates[((endDates.length) - 1)].getTime());
}