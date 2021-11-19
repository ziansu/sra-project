protected int getRandomNumber(int start, int end) {
    int num = (random.nextInt(((end - start) + 1))) + start;
    return num;
}