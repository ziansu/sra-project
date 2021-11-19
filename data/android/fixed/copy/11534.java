private javax.swing.JLabel searchLabel(int panelName) {
    for (javax.swing.JLabel label : labels) {
        if (label.getName().equals(java.lang.String.valueOf(panelName))) {
            return label;
        }
    }
    return null;
}