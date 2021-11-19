public static void main(java.lang.String[] args) throws java.net.UnknownHostException {
    storyboarder.Multiplayer server = new storyboarder.Multiplayer(8887);
    server.start();
    storyboarder.Gui.runSparkServer(8000);
}