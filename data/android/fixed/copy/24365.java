public static void flush() {
    lib2D.window.Canvas c = lib3D.engine.Engine.currentWnd.getCanvas();
    c.clear();
    lib3D.engine.Engine.drawBuffer(c);
    c.repaint();
}