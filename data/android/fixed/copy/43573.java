private void setInitialDate(java.util.Calendar date) {
    dateEditText.setText(android.text.format.DateUtils.formatDateTime(getApplicationContext(), date.getTimeInMillis(), ((android.text.format.DateUtils.FORMAT_SHOW_DATE) | (android.text.format.DateUtils.FORMAT_SHOW_YEAR))));
}