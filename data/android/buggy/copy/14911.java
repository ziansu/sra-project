@java.lang.Override
public void update() {
    com.starshipsim.listeners.KeyboardListener keyboard = manager.getKeyboard();
    if (keyboard.keyDownOnce(java.awt.event.KeyEvent.VK_ESCAPE)) {
        manager.popState();
    }
    if (keyboard.keyDownOnce(java.awt.event.KeyEvent.VK_ENTER)) {
        manager.popState();
    }
}