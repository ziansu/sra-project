void allowTyping(final boolean allowed) {
    javax.swing.SwingUtilities.invokeLater(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            inputField.setEditable(allowed);
            sendButton.setEnabled(allowed);
            shareFileButton.setEnabled(allowed);
        }
    });
}