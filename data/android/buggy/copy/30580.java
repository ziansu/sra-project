@java.lang.Override
public void mousePressed(java.awt.event.MouseEvent e) {
    try {
        method.invoke(this);
        method = fiuba.algo3.view.TileView.class.getDeclaredMethod("defaultBehavior");
    } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException | java.lang.NoSuchMethodException ex) {
        ex.printStackTrace();
    }
}