@java.lang.Override
public void onStop() {
    super.onStop();
    if ((alarm) != null)
        alarm.cancelAlarm(getActivity());
    
}