private void addNotifyListener(javax.swing.JComboBox<java.lang.String> combo) {
    combo.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
            notifyChange();
        }
    });
}