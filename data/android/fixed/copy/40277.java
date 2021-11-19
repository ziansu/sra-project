public void resume() {
    try {
        if ((player) != null) {
            player.start();
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}