@java.lang.Override
public void beginPoly(int windingRule) {
    vBuffer.clear();
    assert windingRule == (java.awt.geom.PathIterator.WIND_NON_ZERO) : "Invalid assumption";
}