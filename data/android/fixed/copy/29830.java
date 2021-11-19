public void run() {
    while (gcGame.running) {
        if (!(buttonUpdated)) {
            c.sendMessage(("set buttonStatus " + (buttonStatus)));
            buttonUpdated = true;
        }
    } 
}