private java.lang.String getLevel(int level) {
    if (level >= (getHeight())) {
        return "";
    }else {
        return getLevel(root, level, 0);
    }
}