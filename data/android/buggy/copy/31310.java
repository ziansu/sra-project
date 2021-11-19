@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    linkViews();
    emailID = getIntent().getStringExtra("emailID");
    initializeBackendless();
    getRecruitmentPhase();
    in.projectmanas.manasliaison.activities.HomeActivity.mCredential = FirstRunActivity.mCredential;
    getCount();
}