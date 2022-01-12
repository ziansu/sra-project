@java.lang.Override
public void mouseReleased(java.awt.event.MouseEvent e) {
    beatsInterval.setValue((60.0 / (beatsSlider.getValue())));
}