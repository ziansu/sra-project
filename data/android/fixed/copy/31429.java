private javax.swing.JButton addButton(java.lang.String text) {
    javax.swing.JButton b = new javax.swing.JButton(text);
    b.addActionListener(this);
    add(b);
    return b;
}