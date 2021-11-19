protected void createFrame() {
    frame = new main.java.org.cytoscape.pokemeow.internal.SampleUsage.JInternalFrameDemo.MyInternalFrame();
    frame.setVisible(true);
    jdpDesktop.add(frame);
    try {
        frame.setSelected(true);
    } catch (java.beans.PropertyVetoException e) {
    }
}