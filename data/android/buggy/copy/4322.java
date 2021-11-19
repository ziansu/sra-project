public void handleLastDayChange(java.lang.String date, java.lang.String dateInUTC) {
    if (date != null) {
        hasChanges = true;
        data.setLastWorkingDay(dateInUTC);
        view.showLastWorkingDay(date);
        view.allowClickOnReasonView();
    }
}