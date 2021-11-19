@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    injectDependencies();
    mSettingsPresenter.setView(this);
}