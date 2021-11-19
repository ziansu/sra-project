public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((sequencer) != null) {
        sequencer.stop();
        sequencer = null;
    }
    redirector.stop();
    connector.disconnect();
    setTitle("Disconnected");
}