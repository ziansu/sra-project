@java.lang.Override
public void terminate(@javax.annotation.Nonnull
java.lang.String vmId, java.lang.String reason) throws org.dasein.cloud.CloudException, org.dasein.cloud.InternalException {
    terminateVm(vmId, null);
    org.dasein.cloud.compute.VirtualMachine vm = getVirtualMachine(vmId);
    terminateVmDisk(vmId, vm.getProviderDataCenterId());
}