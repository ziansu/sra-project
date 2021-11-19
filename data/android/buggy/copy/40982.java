msi.gama.metamodel.topology.projection.MathTransform computeProjection() {
    msi.gama.metamodel.topology.projection.MathTransform crsTransformation = null;
    try {
        crsTransformation = org.geotools.referencing.CRS.findMathTransform(initialCRS, getTargetCRS());
    } catch (org.opengis.referencing.FactoryException e) {
        e.printStackTrace();
        return null;
    }
    return crsTransformation;
}