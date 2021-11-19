public double getBuyPrice() {
    double sellPrice = getSellPrice();
    sellPrice += sellPrice * (markup);
    return java.lang.Math.min(com.gmail.haloinverse.DynamicMarket.util.Util.round(sellPrice, 2), maxPrice);
}