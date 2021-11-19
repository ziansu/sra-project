public float[] createOffsetVerts(float offset, float pointerY) {
    applyCurveXEffect(offset);
    applyScaleXEffect(offset, pointerY);
    mShader = applyShadow(offset);
    return meshVerts;
}