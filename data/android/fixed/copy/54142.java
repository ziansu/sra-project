@java.lang.SuppressWarnings(value = "InfiniteLoopStatement")
private void updateCurrentlyPlaying() throws java.io.IOException, java.lang.ClassNotFoundException {
    while (true) {
        java.lang.String deets = ((java.lang.String) (inFromCurrentlyPlaying.readObject()));
        currentlyPlaying.setText(deets);
        pack();
    } 
}