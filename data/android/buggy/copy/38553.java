@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mMainPresenter = new com.saphir.test.dailynews.presenter.MainPresenterImpl(this);
    initUI();
}