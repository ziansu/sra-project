private void setInitialDate() {
    dateEditText.setText(android.text.format.DateUtils.formatDateTime(getApplicationContext(), selectedDate.getTimeInMillis(), ((android.text.format.DateUtils.FORMAT_SHOW_DATE) | (android.text.format.DateUtils.FORMAT_SHOW_YEAR))));
}