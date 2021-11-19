private void startFromStationInOwnThread(final util.States states, final util.Station start) {
    java.lang.Thread startThread = new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            states.startFromState(start);
        }
    });
}