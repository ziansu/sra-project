public void passTime() {
    if ((shoppingTime) <= 0) {
        shop.sendToTill(this);
        java.lang.System.out.println(((name) + " goes to till"));
    }
    shoppingTime -= aston.resources.Config.secondsPerTick;
}