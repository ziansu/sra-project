public void update(javax.sound.sampled.LineEvent event) {
    if ((event.getType()) == (javax.sound.sampled.LineEvent.Type.STOP)) {
        event.getLine().close();
        java.lang.System.exit(0);
    }
}