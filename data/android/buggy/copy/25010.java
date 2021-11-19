@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((com.example.seagerdevelopments.bpmessengerapp.MainActivity.analytics) != null) {
        com.example.seagerdevelopments.bpmessengerapp.MainActivity.analytics.getSessionClient().resumeSession();
    }
}