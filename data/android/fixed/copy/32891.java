public void unGroup() {
    for (Pattern pattern : group) {
        pattern.clearGroup();
    }
    group.clear();
}