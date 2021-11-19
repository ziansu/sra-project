public model.statistics.BoundedEntityStatistics getDerivedStats() {
    model.statistics.BoundedEntityStatistics derivedStats = this.stats.clone();
    itemManager.merge(derivedStats);
    return derivedStats;
}