@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initViews();
    mMainPresenter = new comkorlex.httpsgithub.videochat.presenter.MainPresenter(this);
    mMainPresenter.outputSessionData();
}