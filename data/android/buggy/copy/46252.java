private void changeMusicRandom() {
    last = current;
    current = new java.util.Random().nextInt(musics.size());
    changeMusic();
}