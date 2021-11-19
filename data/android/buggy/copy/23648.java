public void close() {
    frame.dispose();
    pauseTimer.addActionListener(new java.awt.event.ActionListener() {
        @java.lang.Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            gameTimer.pause();
        }
    });
}