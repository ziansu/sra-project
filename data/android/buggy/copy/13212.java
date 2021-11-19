public java.lang.Boolean canAfford(int cost, int amount) {
    int totalCost = cost * amount;
    return (getMoney()) > totalCost;
}