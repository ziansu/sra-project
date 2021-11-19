public boolean setItem(java.lang.String key, com.sedsigafew.maplegearcalculator.StatObject item) {
    if (statObjectHashMap.containsKey(key)) {
        statObjectHashMap.put(key, item);
        return true;
    }
    return false;
}