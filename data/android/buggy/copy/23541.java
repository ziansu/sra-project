public void pressKey(imp.gui.StepPianoKey keyPlayed, javax.swing.Icon icon) {
    javax.swing.JLabel label = keyPlayed.getLabel();
    if ((label.getIcon()) != icon)
        label.setIcon(icon);
    
    forcePaint();
}