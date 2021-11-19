@java.lang.Override
public void terminate(@javax.annotation.Nonnull
java.lang.String vmId) throws org.dasein.cloud.CloudException, org.dasein.cloud.InternalException {
    org.dasein.cloud.compute.VirtualMachine vm = getVirtualMachine(vmId);
    terminateVm(vmId);
    terminateVmDisk(vmId, vm.getProviderDataCenterId());
}