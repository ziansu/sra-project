private double Consume(int Xtile, int Ytile, double DesiredFood) {
    if (this.isWaterTile) {
        return 0;
    }else {
        return this.eatFoodTile(DesiredFood);
    }
}