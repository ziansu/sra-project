public static void main(java.lang.String[] args) throws java.io.IOException {
    com.example.gameengine.timeoutmonitor.TimeoutMonitor timeoutMonitor = new com.example.gameengine.timeoutmonitor.TimeoutMonitor(java.lang.Integer.parseInt(args[0]));
    timeoutMonitor.monitor();
}