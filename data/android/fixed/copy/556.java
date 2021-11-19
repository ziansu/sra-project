public java.util.List<java.lang.Integer> getPattern() {
    if ((mConfig.mIndex) >= (mConfig.mPatternList.size())) {
        init();
    }
    return mConfig.mPatternList.get(((mConfig.mIndex)++));
}