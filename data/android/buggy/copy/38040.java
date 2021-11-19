public net.sf.freecol.common.model.PathNode getFirstNode() {
    net.sf.freecol.common.model.PathNode path;
    for (path = this; (path.previous) != null; path = path.previous);
    return path;
}