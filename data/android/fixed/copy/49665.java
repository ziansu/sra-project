@java.lang.Override
public void onDateSet(android.widget.DatePicker view, int year, int month, int dayOfMonth) {
    org.joda.time.LocalDate setDate = new org.joda.time.LocalDate(year, (month + 1), dayOfMonth);
    infinitePager.setInfinitePagerData(new com.eleith.calchoochoo.utils.InfinitePagerDataDates(setDate));
}