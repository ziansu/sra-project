private static void clearStatic() {
    espresso.minimizers.espressoMinimizer.expand.Expand.loweringSet.clear();
    espresso.minimizers.espressoMinimizer.expand.Expand.raisingSet.clear();
    espresso.minimizers.espressoMinimizer.expand.Expand.removedCoverRows.clear();
    espresso.minimizers.espressoMinimizer.expand.Expand.removedBlockRows.clear();
    espresso.minimizers.espressoMinimizer.expand.Expand.removedColumns.clear();
}