@java.lang.Override
public void resume() {
    if (((handler) != null) && (handler.isPrepared()))
        handler.resume();
    else
        if ((handler) == null) {
            restart();
        }
    
}