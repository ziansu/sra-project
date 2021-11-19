public net.sf.freecol.common.model.PathNode getFirstNode() {
    net.sf.freecol.common.model.PathNode path;
    path = this;
    while ((path.previous) != null) {
        path = path.previous;
    } 
    return path;
}