@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    nu.yona.app.YonaApplication.getEventChangeManager().registerListener(this);
    loadPasscodeView();
    initializeAnimation();
}