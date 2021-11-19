@java.lang.Override
public void execute() throws java.lang.Exception {
    com.emc.vipr.client.Tasks<com.emc.storageos.model.block.VolumeRestRep> tasks = execute(new com.emc.sa.service.vipr.block.tasks.ChangeBlockVolumeVirtualArray(volumeIds, targetVirtualArray.toString(), migrationType, migrationHost.toString()));
    addAffectedResources(tasks);
}