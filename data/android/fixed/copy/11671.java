public java.lang.String getTotalEndDate() {
    return new java.text.SimpleDateFormat("yyyy-MM-dd").format(endDates[((type) - 1)].getTime());
}