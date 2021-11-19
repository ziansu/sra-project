private java.awt.geom.Point2D getPosition(int totalByteIndex) {
    return new java.awt.geom.Point2D.Double((((int) (java.lang.Math.floor((totalByteIndex / (blockSize))))) - 1), (totalByteIndex % (blockSize)));
}