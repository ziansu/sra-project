private int getRandomHeight() {
    return java.lang.Math.min(skiplists.versioned.VersionedNodes.TOP, skiplists.versioned.RandomLevelGenerator.randomLevel());
}