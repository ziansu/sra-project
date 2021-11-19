@java.lang.Override
public boolean fitsSearchType(jsettlers.algorithms.path.IPathCalculatable pathCalculable, jsettlers.common.position.ShortPoint2D pos, jsettlers.common.material.ESearchType searchType) {
    return pathfinderGrid.fitsSearchType(pos.x, pos.y, searchType, pathCalculable);
}