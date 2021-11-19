public int compare(com.ctrip.zeus.service.build.impl.Group group0, com.ctrip.zeus.service.build.impl.Group group1) {
    return (groupPriorityMap.get(group0.getId())) - (groupPriorityMap.get(group1.getId()));
}