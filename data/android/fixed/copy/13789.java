@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_job_board);
    userID = getIntent().getExtras().getString("userID");
    new com.may1722.t_go.ui.JobBoardActivity.AsyncGetJobs().execute(userID);
}