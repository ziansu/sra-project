public void startPing() {
    pingTimer = new javax.swing.Timer(org.montsuqi.monsiaj.client.Client.PING_TIMER_PERIOD, new java.awt.event.ActionListener() {
        @java.lang.Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            sendPing();
        }
    });
    pingTimer.start();
}