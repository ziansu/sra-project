public void addHandler(@org.jetbrains.annotations.NotNull
net.openhft.chronicle.threads.api.EventHandler handler) {
    synchronized(handlers) {
        handlers.add(handler);
        handler.eventLoop(parent);
    }
}