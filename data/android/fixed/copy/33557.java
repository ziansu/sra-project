public static void main(java.lang.String[] args) throws java.io.IOException {
    com.example.gameengine.timeoutmonitor.TimeoutMonitor timeoutMonitor = new com.example.gameengine.timeoutmonitor.TimeoutMonitor(args[0], java.lang.Integer.parseInt(args[1]));
    timeoutMonitor.monitor();
}