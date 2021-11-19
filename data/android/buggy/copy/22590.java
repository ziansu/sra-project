public void setIndeterminate(boolean indet) {
    synchronized(this) {
        this.indeterminate = indet;
    }
    javax.swing.SwingUtilities.invokeLater(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            progressPanel.setIndeterminate(indeterminate);
        }
    });
}