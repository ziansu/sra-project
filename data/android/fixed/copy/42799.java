@java.lang.Override
public void onClick(android.view.View view) {
    new net.alhazmy13.hijridatepicker.HijriCalendarDialog.Builder(this).setOnDateSetListener(this).setMinMaxHijriYear(1430, 1450).setMinMaxGregorianYear(2013, 2020).setMode(HijriCalendarDialog.Mode.Hijri).show();
}