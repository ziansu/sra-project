private void getMilk(java.lang.String arrow) {
    int newMilk;
    if (checkHand(arrow)) {
        newMilk = currentCow.giveMilk();
        milk += newMilk;
    }
}