public void onClose(ch.aiko.engine.graphics.Screen s) {
    isOpen = false;
    input.remove(s);
}