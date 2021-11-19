@java.lang.Override
public rx.Observable<java.lang.Void> call(java.lang.Void qbVoid) {
    authorized = false;
    notifyLogout(this);
    return observable;
}