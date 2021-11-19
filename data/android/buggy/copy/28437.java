public void useToilet(Pet a) {
    int num = a.getBladder();
    num = 10 - num;
    a.setBladder(num);
    printToScreen(((a.getName()) + " feels relief."));
}