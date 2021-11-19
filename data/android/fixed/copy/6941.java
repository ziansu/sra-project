public void buySugar(int sugarAmount) {
    this.sugar += sugarAmount;
    this.money -= java.lang.Math.round((sugarAmount / 10));
}