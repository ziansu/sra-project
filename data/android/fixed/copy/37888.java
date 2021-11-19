protected void removeHandler(android.os.Handler handler) {
    handler.removeCallbacksAndMessages(null);
    io.realm.BaseRealm.handlers.remove(handler);
    this.handler = null;
}