public com.datadisplay.CartesianGraph showCartesian() {
    com.datadisplay.CartesianGraph cg = new com.datadisplay.CartesianGraph();
    frame.getContentPane().add(cg, java.awt.BorderLayout.CENTER);
    frame.pack();
    return cg;
}