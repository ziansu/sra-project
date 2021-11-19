@java.lang.Override
public void onError(java.lang.Throwable e) {
    if ((view) != null) {
        view.sendComplite(false);
        view.onError(e.getMessage());
    }
}