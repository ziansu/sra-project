@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    butterknife.ButterKnife.bind(this);
    cn.ucai.fulicenter.utils.L.i("mingyue", "MainActivity.onCreate()");
    initView();
}