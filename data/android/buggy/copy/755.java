public void addPassed(java.util.Date date) {
    if (((passedLastDate) == null) || (passedLastDate.before(date))) {
        passedLastDate = date;
    }
    (passed)++;
}