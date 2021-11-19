@java.lang.Override
public void onDestroyView() {
    saveSession();
    stepAttemptPresenter.detachView(this);
    super.onDestroyView();
}