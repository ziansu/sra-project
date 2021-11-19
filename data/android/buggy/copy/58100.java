@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    safeSetTitle(getString(R.string.utah_fishing_report));
    initView();
    load();
}