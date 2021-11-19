@java.lang.Override
public translator.model.NodeGrid clone() {
    translator.model.NodeGrid nodeGrid = new translator.model.NodeGrid(grid.length);
    if (copy(this, nodeGrid))
        return nodeGrid;
    
    return null;
}