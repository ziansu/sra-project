public void setIndeterminate(boolean indeterminate) {
    synchronized(this) {
        this.indeterminate = indeterminate;
    }
    javax.swing.SwingUtilities.invokeLater(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            progressPanel.setIndeterminate(indeterminate);
        }
    });
}