private void init() {
    transitView = new com.missmess.calendarview.MonthView(getContext());
    transitView.showMonthTitle(false);
    transitView.showWeekLabel(false);
    transitView.setVisibility(View.GONE);
    super.addView(transitView);
}