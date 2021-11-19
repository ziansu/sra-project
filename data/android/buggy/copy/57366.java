@java.lang.Override
public void resume() {
    if (((handler) != null) && (handler.isPrepared()))
        handler.resume();
    else {
        restart();
    }
}