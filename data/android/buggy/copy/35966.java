@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((getArguments()) != null) {
        scheduleItems = getArguments().getParcelableArrayList(com.digzdigital.hebronradio.fragment.ScheduleDetails.ARG_PARAM1);
    }
}