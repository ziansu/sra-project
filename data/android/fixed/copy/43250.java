private void handlePerpendicularPair(geometry.proofs.FigureRelation pair) {
    java.lang.String angleName = util.Utils.getAngleBetween(pair.getFigure0().getName(), pair.getFigure1().getName());
    diagram.makeRightAngle(angleName, pair);
}