public void mouseWheelMoved(java.awt.event.MouseWheelEvent event) {
    conn.sendMouseScroll(((byte) (event.getWheelRotation())));
    event.consume();
}