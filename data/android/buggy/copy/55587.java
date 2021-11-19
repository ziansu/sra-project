@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    com.pffair.dagger2demo.DaggerMainComponent.builder().role(new com.pffair.dagger2demo.Role("是Android开发")).build().inject(this);
    initView();
}