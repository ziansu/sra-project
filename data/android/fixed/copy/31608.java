public void onClick(android.content.DialogInterface dialog, int which) {
    if ((mListener) != null) {
        mListener.onPositiveButtonClick(dateTimeCalendar.getTime());
    }
}