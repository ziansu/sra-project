@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_normal_key_board);
    initAnim();
    initView();
    valueList = virtualKeyboardView.getValueList();
}