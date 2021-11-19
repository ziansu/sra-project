public edu.internet2.middleware.grouper.pspng.GrouperGroupInfo getGroupInfo(edu.internet2.middleware.grouper.pspng.Provisioner provisioner) {
    java.lang.String groupName = getGroupName();
    if (groupName == null)
        return null;
    
    return provisioner.getGroupInfo(groupName);
}