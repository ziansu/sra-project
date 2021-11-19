@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    mMonthColorStrings = null;
    mCalendar = null;
    mDaysStrings = null;
    mNumberOfFragment = null;
    mCurrentMonth = null;
}