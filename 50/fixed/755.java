public void addPassed(java.util.Date date) {
    if ((date != null) && (((passedLastDate) == null) || (passedLastDate.before(date)))) {
        passedLastDate = date;
    }
    (passed)++;
}