public void onClick(android.content.DialogInterface dialog, int which) {
    if ((mListener) != null) {
        assignAllValuesToCalendar();
        mListener.onPositiveButtonClick(dateTimeCalendar.getTime());
    }
}