public void resume() {
    try {
        if ((player) != null) {
            player.prepareAsync();
            player.start();
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}