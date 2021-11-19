@java.lang.Override
public final void onTokenExpired() {
    if ((view) != null) {
        view.get().hideProgress();
        view.get().onTokenExpired();
    }
}