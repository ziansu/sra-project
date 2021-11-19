protected int getRandomNumber(int start, int end) {
    int num = (random.nextInt((end - start))) + start;
    return num;
}