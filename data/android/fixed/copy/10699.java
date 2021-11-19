@java.lang.Override
public translator.model.TileGrid clone() {
    translator.model.TileGrid tileGrid = new translator.model.TileGrid(grid.length);
    translator.model.TileGrid.copy(this, tileGrid);
    return tileGrid;
}