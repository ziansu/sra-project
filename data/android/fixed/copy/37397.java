private void addCloseListener() {
    closeButton.addActionListener(( e) -> {
        dateFrameController.close();
        dispatchEvent(new java.awt.event.WindowEvent(this, java.awt.event.WindowEvent.WINDOW_CLOSING));
    });
}