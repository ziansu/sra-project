private void gameLogic() {
    while (running) {
        try {
            java.lang.Thread.sleep(10);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
        c.sendMessage("get throttle");
        c.sendMessage("get rocketHeading");
    } 
}