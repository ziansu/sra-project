@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    UI.updateUI(this);
    android.util.Log.d("mainactivity", "onCreate");
}