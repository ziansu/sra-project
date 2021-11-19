public int increasePrice(int oldPrice, int upgradeAmount) {
    int newPrice = oldPrice * (2 * upgradeAmount);
    android.util.Log.d("Test 2", ("" + upgradeAmount));
    return newPrice;
}