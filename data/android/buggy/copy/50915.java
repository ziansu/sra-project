@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mProgressBar = ((com.antonzorin.dottedprogressbar.DottedProgressBar) (findViewById(R.id.progress)));
    mProgressBar.setClockWiseDots(false);
    mProgressBar.setBaseColor(R.color.colorGreen);
}