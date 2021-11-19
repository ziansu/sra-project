@java.lang.Override
public java.lang.Void apply(java.awt.Robot r) {
    r.keyPress(java.awt.event.KeyEvent.VK_SHIFT);
    r.keyPress(keys[index]);
    r.keyRelease(java.awt.event.KeyEvent.VK_SHIFT);
    r.keyRelease(keys[index]);
    return null;
}