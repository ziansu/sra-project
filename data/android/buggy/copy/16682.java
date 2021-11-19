@java.lang.Override
public void mouseWheelMoved(com.jogamp.newt.event.MouseEvent e) {
    coreApp.getInputProcessor().pointerEvent(PointerAction.e.getWhen(), id, new float[]{ xpos[i] , ypos[i] });
}