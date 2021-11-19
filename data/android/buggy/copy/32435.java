private void migrateWithSuccess(final com.hazelcast.internal.partition.MigrationInfo migration) {
    final com.hazelcast.internal.partition.impl.InternalPartitionServiceImpl partitionService = ((com.hazelcast.internal.partition.impl.InternalPartitionServiceImpl) (getPartitionService(instances[0])));
    partitionService.getMigrationManager().scheduleMigration(migration, com.hazelcast.internal.partition.impl.MigrationManager.MigrateTaskReason.REPARTITIONING);
    waitAllForSafeState(instances);
}