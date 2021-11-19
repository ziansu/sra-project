private void initializeChannel() {
    this.channels = new java.util.ArrayList<>();
    for (int i = 1; i <= 10; i++) {
        this.channels.add(i, new telecomsimulator.Channel(i));
    }
}