public boolean isEmpty() {
    if (isMapInitialized) {
        return topLevelMap.isEmpty();
    }
    return (resourceBundle.keySet().size()) == 0;
}