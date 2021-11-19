public double calculateGaussConstraint(org.openpixi.pixi.physics.grid.Grid grid) {
    GaussConstraint.reset(grid);
    grid.getCellIterator().execute(grid, GaussConstraint);
    return GaussConstraint.getSum();
}