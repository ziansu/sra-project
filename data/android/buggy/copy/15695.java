@java.lang.Override
public void onResume() {
    super.onResume();
    android.content.SharedPreferences sharedPrefs = edu.mit.mitmobile2.PreferenceUtils.getDefaultSharedPreferencesMultiProcess(getActivity());
    if (filterChanged(sharedPrefs)) {
        getCalendarEvents(getArguments().getString(edu.mit.mitmobile2.events.fragment.CalendarDayFragment.DATE), true);
    }
}