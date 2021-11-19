public void emit(java.lang.String event, java.lang.Object data) {
    mLoop.enqueue(new me.mneri.eloop.Loop.Event(this, event, data));
}