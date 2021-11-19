private void setBorderColor(java.awt.Color color) {
    javax.swing.border.Border border = getBorder();
    if (border instanceof com.mucommander.ui.border.MutableLineBorder) {
        ((com.mucommander.ui.border.MutableLineBorder) (border)).setLineColor(color);
    }
}