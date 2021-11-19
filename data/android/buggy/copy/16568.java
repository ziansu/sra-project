protected geogebra.common.kernel.geos.GeoElement[] createCircle2ForPoints3D(geogebra.common.kernel.kernelND.GeoPointND p0, geogebra.common.kernel.kernelND.GeoPointND p1) {
    return new geogebra.common.kernel.geos.GeoElement[]{ kernel.getManager3D().Circle3D(null, p0, p1, ((geogebra.euclidian.EuclidianView) (view)).getDirection()) };
}