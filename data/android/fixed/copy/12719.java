public void playFirst() {
    index = 0;
    current = getSong(index);
    mpCurrent = getMP(index);
    playSong(mpCurrent);
}