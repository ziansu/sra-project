public static java.awt.Rectangle getBounds(int id) {
    return new java.awt.Rectangle(org.sikuli.script.Screen.runTime.getMonitor(org.sikuli.script.Screen.getValidID(id)));
}