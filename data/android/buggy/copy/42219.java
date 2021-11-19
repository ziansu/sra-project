public void setTitle(final java.lang.String title) {
    this.title = title;
    for (com.dmdirc.interfaces.FrameInfoListener listener : listeners.get(com.dmdirc.interfaces.FrameInfoListener.class)) {
        listener.titleChanged(this, name);
    }
}