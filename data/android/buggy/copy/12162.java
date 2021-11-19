@java.lang.Override
public translator.model.NodeGrid clone() {
    if ((grid) == null)
        return null;
    
    translator.model.NodeGrid nodeGrid = new translator.model.NodeGrid(grid.length);
    if (copy(this, nodeGrid))
        return nodeGrid;
    
    return null;
}