@java.lang.Override
public void init(java.awt.Canvas canvas) {
    canvas.addKeyListener(this);
    canvas.addKeyListener(getPlayer());
}