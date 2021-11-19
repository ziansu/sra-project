private boolean checkDelaunay() {
    for (pfg.kraken.dstarlite.navmesh.NavmeshEdge e : edgesInProgress)
        assert !(e.flipIfNecessary(false)) : e;
    
    return true;
}