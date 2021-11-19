public synchronized void stop() {
    running = false;
    for (webroom.engine.Texture t : textures) {
        t.stop();
    }
    timer.stop();
}