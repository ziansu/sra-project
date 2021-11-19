public com.mapchat.entitypackage.Groups getCurrentGroup() {
    if ((currentGroup) == null)
        return null;
    
    java.lang.System.out.println(("current group: " + (currentGroup.getGroupName())));
    return currentGroup;
}