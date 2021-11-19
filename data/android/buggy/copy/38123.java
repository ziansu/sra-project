public org.apache.hadoop.yarn.api.records.Resource getCapability() {
    org.apache.hadoop.yarn.api.records.Resource capability = org.apache.hadoop.yarn.util.Records.newRecord(org.apache.hadoop.yarn.api.records.Resource.class);
    capability.setMemory(memoryMb);
    capability.setVirtualCores(vCores);
    org.apache.drill.yarn.core.DoYUtil.callSetDiskIfExists(capability, "setDisks", disks);
    return capability;
}