@java.lang.Override
public void show() {
    java.lang.System.out.println("spookyScreen.show()");
    hideTime = (java.lang.System.currentTimeMillis()) + (displayTime);
    guiNode.attachChild(overlay);
}