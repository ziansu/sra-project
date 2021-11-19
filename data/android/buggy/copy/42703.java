public boolean isEmpty() {
    if (isMapInitialized) {
        return topLevelMap.isEmpty();
    }else {
        return (resourceBundle.keySet().size()) == 0;
    }
}