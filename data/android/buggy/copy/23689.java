public double calculateTotalChargeSquared(org.openpixi.pixi.physics.grid.Grid grid) {
    totalChargeSquared.reset(grid);
    grid.getCellIterator().execute(grid, totalChargeSquared);
    return totalChargeSquared.getSum(grid);
}