private int randomWorldSize() {
    controller.Random random = new controller.Random();
    int worldSize = (random.nextInt(10000)) + 5000;
    return worldSize;
}