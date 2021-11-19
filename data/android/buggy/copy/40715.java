@java.lang.Override
public void onDateClicked(int year, int month, int dayOfMonth) {
    dateRangeManager.setDateRangeForDate(year, month, dayOfMonth);
    viewPager.setCurrentItem(0, true);
}