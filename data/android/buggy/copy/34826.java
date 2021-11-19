public void start() {
    java.lang.System.out.println(((org.bigbluebutton.screenshare.client.net.NetworkStreamSender.NAME) + "Starting network sender."));
    httpSenders.start();
    timer.scheduleAtFixedRate(timerTask, 0, (2 * 1000));
}