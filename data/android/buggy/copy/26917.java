@java.lang.Override
public void mouseReleased(java.awt.event.MouseEvent me) {
    Manager.mouseDown = false;
    Manager.requestMousePosition = true;
    ((javax.swing.JButton) (me.getSource())).setBorder(javax.swing.BorderFactory.createEmptyBorder());
    java.lang.System.out.println("Mouse up");
}