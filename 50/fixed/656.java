public static void loseBet(int bet) {
    Money.money = (Money.money) - bet;
    java.lang.System.out.println(("Money:$" + (Money.money)));
}