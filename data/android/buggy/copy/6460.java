@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState, android.os.PersistableBundle persistentState) {
    super.onCreate(savedInstanceState, persistentState);
    setContentView(getLayoutResource());
    butterknife.ButterKnife.inject(this);
}