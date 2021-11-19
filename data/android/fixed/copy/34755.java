private boolean dismiss(java.lang.Integer key, long startDelay) {
    return (mTipsMap.containsKey(key)) && (dismiss(mTipsMap.get(key), false, startDelay));
}