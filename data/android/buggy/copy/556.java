public java.util.List<java.lang.Integer> getPattern() {
    int index = (mConfig.mIndex)++;
    if (index >= (mConfig.mPatternList.size())) {
        init();
    }
    return mConfig.mPatternList.get(index);
}