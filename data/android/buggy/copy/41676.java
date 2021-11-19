public void changeVolume(double volume) {
    if (volume > 500) {
        volume = 500;
    }
    cow.setVolume(((int) ((volume * 127) / 500)));
}