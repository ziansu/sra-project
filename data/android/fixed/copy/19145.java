private static java.awt.DisplayMode getEffectiveMode() {
    return (!(org.lwjgl.opengl.Display.isFullscreen())) && ((org.lwjgl.opengl.Display.parent) != null) ? new java.awt.DisplayMode(org.lwjgl.opengl.Display.parent.getWidth(), org.lwjgl.opengl.Display.parent.getHeight()) : org.lwjgl.opengl.Display.current_mode;
}