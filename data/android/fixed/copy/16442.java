@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    new com.example.adrian.leagueplayers.activity.GetScheduleTask(this).execute();
}