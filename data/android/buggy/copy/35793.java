@java.lang.Override
public void onError() {
    view.hideProgress();
    call = null;
}