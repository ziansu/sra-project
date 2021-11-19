@java.lang.Override
public java.lang.String getClusterNameById(final int iClusterId) {
    if (iClusterId == (-1))
        return null;
    
    checkIfActive();
    return storage.getPhysicalClusterNameById(iClusterId);
}