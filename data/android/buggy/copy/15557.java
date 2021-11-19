public int jako() {
    int jaetunIndeksi = (arpa.nextInt(pakka.size())) - 1;
    int jaettavaKortti = pakka.get(jaetunIndeksi);
    pakka.remove(jaetunIndeksi);
    return jaettavaKortti;
}