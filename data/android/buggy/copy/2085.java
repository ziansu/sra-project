@java.lang.Override
public int getColor(prefuse.visual.VisualItem item) {
    if (item.isInGroup(Visualization.FOCUS_ITEMS))
        return prefuse.util.ColorLib.gray(0);
    
    return item.getFillColor();
}