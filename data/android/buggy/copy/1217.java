@java.lang.Override
public void mouseReleased(java.awt.event.MouseEvent me) {
    if ((ijImage_) instanceof org.micromanager.display.internal.MMCompositeImage) {
        ((org.micromanager.display.internal.MMCompositeImage) (ijImage_)).updateAndDraw();
    }else {
        ijImage_.updateAndDraw();
    }
}