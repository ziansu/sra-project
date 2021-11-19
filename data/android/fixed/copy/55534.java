void updateDupAccumulatorForTranslation(com.js.geometry.Point translation) {
    com.js.geometry.Point dup = mState.getDupAccumulator();
    mState.setDupAccumulator(com.js.geometry.MyMath.add(dup, translation));
    if (mDupAffectsClipboard)
        replaceClipboardWithSelectedObjects();
    
}