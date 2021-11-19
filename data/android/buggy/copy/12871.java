@java.lang.Override
public java.util.List<bg.bc.tools.chronos.core.entities.DChangelog> getChangelogsForUpdateCounterBetween(double lessThanUpdateCounter, double greaterThanUpdateCounter) {
    return changelogRepo.findByUpdateCounterBetween(lessThanUpdateCounter, greaterThanUpdateCounter).stream().map(DbToDomainMapper::dbToDomainChangelog).collect(java.util.stream.Collectors.toList());
}