public boolean isOnPath(org.geogebra.common.kernel.kernelND.GeoPointND P, double eps) {
    setChangingPoint(P);
    org.geogebra.common.kernel.MyPoint closestPoint = getClosestPoint();
    if (closestPoint != null) {
        return (closestPointDist) < eps;
    }
    return false;
}