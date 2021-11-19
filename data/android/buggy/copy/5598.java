@java.lang.Override
public java.util.Optional<java.lang.Iterable<org.carlspring.strongbox.crontask.domain.CronTaskConfiguration>> findAll(java.lang.Iterable<java.lang.String> var1) {
    return java.util.Optional.ofNullable(repository.findAll(var1));
}