@java.lang.Override
public void terminate(@javax.annotation.Nonnull
java.lang.String vmId) throws org.dasein.cloud.CloudException, org.dasein.cloud.InternalException {
    terminateVm(vmId);
    org.dasein.cloud.compute.VirtualMachine vm = getVirtualMachine(vmId);
    terminateVmDisk(vmId, vm.getProviderDataCenterId());
}