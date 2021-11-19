@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mPresentType = getResources().getStringArray(R.array.present_types);
    buildLoginDialog();
    mLoginDialog.show();
}