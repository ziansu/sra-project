@java.lang.Override
public void onRequiredAuthorization() {
    if ((view) != null) {
        view.get().hideProgress();
        view.get().onRequiredLogin();
    }
}