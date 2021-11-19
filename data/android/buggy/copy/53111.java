public java.awt.Dimension getPreferredSize(javax.swing.JComponent c) {
    java.awt.Dimension dim = super.getPreferredSize(c);
    return new java.awt.Dimension(dim.width, dim.height);
}