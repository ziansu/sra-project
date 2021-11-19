public com.pihen.d3restapi.beans.XP getXPByLevel(int level) {
    if (level < 1)
        return new com.pihen.d3restapi.beans.XP(0, 0, 0);
    
    return lvlList.get(level);
}