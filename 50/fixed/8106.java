public boolean isSet(java.lang.String id) {
    id = id.toUpperCase();
    if ((currentLevel) < 0)
        return false;
    
    return levels.get(currentLevel).containsKey(id);
}