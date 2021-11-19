private void fire(int eventCode) {
    for (com.mygdx.game.Listener f : listeners) {
        f.on(eventCode);
    }
}