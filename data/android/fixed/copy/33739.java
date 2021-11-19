@java.lang.Override
public void onNext(java.lang.Boolean o) {
    if ((view) != null) {
        view.sendComplite(o);
    }
}