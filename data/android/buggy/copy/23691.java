public int size() {
    if (isMapInitialized) {
        return (topLevelMap.size()) - 1;
    }else {
        return resourceBundle.keySet().size();
    }
}