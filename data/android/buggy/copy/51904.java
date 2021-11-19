public static void setBold(javax.swing.JLabel label) {
    java.awt.Font f = label.getFont();
    label.setFont(f.deriveFont(((f.getStyle()) | (java.awt.Font.BOLD))));
}