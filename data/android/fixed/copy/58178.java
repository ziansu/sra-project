private void showTimePickerDialog(android.view.View view) {
    com.example.framgia.hrm_10.controller.time.DatePickerFragment showTime = new com.example.framgia.hrm_10.controller.time.DatePickerFragment().setTextViewBirthday(mTextViewBirthday);
    showTime.show(getSupportFragmentManager(), Settings.DATE_PICKER);
}