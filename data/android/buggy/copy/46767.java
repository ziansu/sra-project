public org.textensor.stochdiff.numeric.morph.TreePoint toTreePoint() {
    org.textensor.stochdiff.numeric.morph.TreePoint tp = new org.textensor.stochdiff.numeric.morph.TreePoint(x, y, z, r);
    if ((label) != null)
        tp.setLabel(label);
    
    return tp;
}