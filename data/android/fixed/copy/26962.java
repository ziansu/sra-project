@java.lang.Override
public org.onosproject.dhcp.IpAssignment getIpAssignmentFromAllocationMap(org.onosproject.net.HostId hostId) {
    if ((allocationMap.get(hostId)) != null) {
        return allocationMap.get(hostId).value();
    }else {
        return null;
    }
}