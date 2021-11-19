private void updatePreview(java.text.SimpleDateFormat format) {
    format.setTimeZone(org.eclipse.egit.ui.internal.preferences.DateFormatPreferencePage.SAMPLE.getTimeZone());
    dateFormatPreview.setText(format.format(org.eclipse.egit.ui.internal.preferences.DateFormatPreferencePage.SAMPLE.getWhen()));
}