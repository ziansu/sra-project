@java.lang.Override
public void onError(java.lang.Throwable e) {
    view.sendComplite(false);
    view.onError(e.getMessage());
}