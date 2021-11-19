public void testNotIncluded() {
    java.lang.System.out.println("Testing CoatHat: notIncluded");
    edu.jalc.coat.hat.CoatHat hat = new edu.jalc.coat.hat.CoatHat(4);
    hat.included();
    assert hat.isWithHat();
}