@java.lang.Override
public org.onosproject.dhcp.IpAssignment getIpAssignmentFromAllocationMap(org.onosproject.net.HostId hostId) {
    return allocationMap.get(hostId).value();
}