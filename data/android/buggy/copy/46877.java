public int getRandomProduktIndex(int size) {
    size--;
    int zahl = 0;
    zahl = rnd.nextInt(size);
    return zahl;
}