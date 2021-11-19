public javax.swing.JPanel createCostView() {
    javax.swing.JPanel panel = new javax.swing.JPanel(new java.awt.GridBagLayout());
    javax.swing.JLabel costLabel = new javax.swing.JLabel(java.lang.String.format("Cost: %.2f", selectedRoom.getCost()));
    panel.add(costLabel);
    return panel;
}