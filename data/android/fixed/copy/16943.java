@java.lang.Override
public void onDateSet(android.widget.DatePicker datePicker, int year, int month, int day) {
    etBeginDate.setText(com.codepath.nytquest.utils.DateHelper.getFormatteDate(year, (month + 1), day));
}