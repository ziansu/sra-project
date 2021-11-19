public void setMoney(double money) {
    if (money >= 0) {
        this.money = money;
    }else {
        java.lang.System.out.println("Invalid money");
    }
}