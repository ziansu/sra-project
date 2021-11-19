public void onRecalculateModelMatrix(org.rajawali3d.math.Matrix4 parentMatrix) {
    if (mIsModelMatrixDirty) {
        calculateModelMatrix(parentMatrix);
        if ((mGraphNode) != null)
            mGraphNode.updateObject(this);
        
        mIsModelMatrixDirty = false;
    }
}