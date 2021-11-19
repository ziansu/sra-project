private void setTotalWorkingTime(boolean error) {
    java.lang.String totalWorkingTime = mDay.getTotalWorkingTime().toPeriod().toString(Day.PERIOD_FORMATTER);
    mtotalWorkingHours.setText(totalWorkingTime);
    setTextColor(mPause, error);
}