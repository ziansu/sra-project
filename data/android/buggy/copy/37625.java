public void setLabel(javax.swing.JLabel label, java.lang.String title, java.lang.String text) {
    label.setText(text);
    ((javax.swing.border.TitledBorder) (label.getBorder())).setTitle(title);
}