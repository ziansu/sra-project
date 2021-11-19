public boolean isOneSpaceEye(de.cgawron.go.Point p) {
    de.cgawron.go.montecarlo.AnalysisGoban.Cluster c = getBoardRep(p).cluster;
    return ((c.getColor()) == (BoardType.EMPTY)) && ((c.getPoints().size()) == 1);
}