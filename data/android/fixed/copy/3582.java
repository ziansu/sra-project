public static void calcTip(double bill) {
    final double RATE = 0.15;
    double tip = bill * RATE;
    java.lang.System.out.println(("The tip should be at least " + tip));
}