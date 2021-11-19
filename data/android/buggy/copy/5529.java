@java.lang.Override
public void resume() {
    if ((((handler) != null) && ((mHandlerThread) != null)) && (handler.isPrepared()))
        handler.resume();
    else {
        restart();
    }
}