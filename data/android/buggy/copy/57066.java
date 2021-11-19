@java.lang.Override
protected void initView() {
    setContentView(R.layout.activity_main);
    bottomNav = ((com.example.administrator.gc.widget.BottomNav) (findViewById(R.id.mainBottomNav)));
    switchFragment(0);
}