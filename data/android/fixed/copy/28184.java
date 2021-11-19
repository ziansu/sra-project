protected void updateGregorianDateLabel() {
    gregorianDateText.setText(org.odk.collect.android.utilities.DateTimeUtils.getDateTimeBasedOnUserLocale(getDateAsGregorian(getOriginalDate()).toDate(), calendarMode, false));
}