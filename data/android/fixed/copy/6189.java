public void addToBoxList(java.lang.String name) {
    javax.swing.JLabel label = new javax.swing.JLabel(name);
    label.addMouseListener(adapter);
    objectBox.add(label);
    labels.add(label);
}