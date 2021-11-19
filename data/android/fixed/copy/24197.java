public void volumeDown() {
    if ((currentVolume) > ((-1) + (hw1.Television.VOLUME_INCREMENT))) {
        currentVolume = (currentVolume) - (hw1.Television.VOLUME_INCREMENT);
    }else {
        currentVolume = 0;
    }
}