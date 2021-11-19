private static void addType(java.lang.String id, int cores) {
    de.unibi.cebitec.bibigrid.meta.googlecloud.InstanceTypeGoogleCloud.count.put(id, new de.unibi.cebitec.bibigrid.util.InstanceInformation.InstanceSpecification(cores, 0, false, true, true));
}