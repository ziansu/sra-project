private void clearChildrenCache() {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) {
        setLayerType(com.appl.library.LAYER_TYPE_NONE, null);
        setChildrenDrawingCacheEnabled(false);
        mChildrenCacheState = false;
    }else {
        setChildrenDrawnWithCacheEnabled(true);
    }
}