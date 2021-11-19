@java.lang.Override
public void update(double interest, double taxes) {
    money = (money) + ((money) * interest);
    money = (money) - taxes;
}