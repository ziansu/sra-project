@java.lang.Override
public java.util.Optional<java.util.List<org.carlspring.strongbox.crontask.domain.CronTaskConfiguration>> findAll(java.util.List<java.lang.String> var1) {
    return java.util.Optional.ofNullable(repository.findAll(var1));
}