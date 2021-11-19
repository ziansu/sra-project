public boolean setItem(com.sedsigafew.maplegearcalculator.StatKey key, com.sedsigafew.maplegearcalculator.StatObject item) {
    if (statObjectHashMap.containsKey(key)) {
        statObjectHashMap.put(key, item);
        return true;
    }
    return false;
}