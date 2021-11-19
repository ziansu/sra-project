@java.lang.Override
public java.util.List<bg.bc.tools.chronos.core.entities.DChangelog> getChangelogsForUpdateCounterLessThan(double lessThanModifierValue) {
    return changelogRepo.findByUpdateCounterLessThan(lessThanModifierValue).stream().map(DbToDomainMapper::dbToDomainChangelog).collect(java.util.stream.Collectors.toList());
}