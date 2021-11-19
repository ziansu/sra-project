@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    initTaskDescription();
    initTheme();
    super.onCreate(savedInstanceState);
    mFragmentManagerHelper = new com.ebnbin.ebapplication.base.FragmentManagerHelper(getFragmentManager(), android.R.id.content);
}