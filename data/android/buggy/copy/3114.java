@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);
    mUnbinder = butterknife.ButterKnife.bind(this);
    initData();
    initView();
}