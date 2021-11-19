public int generateMemoryReq() {
    Random rand = new Random();
    int n = (rand.nextInt(48)) + 16;
    return n;
}