private void setBorderColor(java.awt.Color color) {
    javax.swing.border.Border border;
    if ((border = getBorder()) instanceof com.mucommander.ui.border.MutableLineBorder) {
        ((com.mucommander.ui.border.MutableLineBorder) (border)).setLineColor(color);
    }
}