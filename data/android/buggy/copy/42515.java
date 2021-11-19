public buildcraft.api.robots.EntityRobotBase robotTaking() {
    if ((robotTakingId) == (EntityRobotBase.NULL_ROBOT_ID)) {
        return null;
    }else
        if ((robotTaking) == null) {
            robotTaking = RobotManager.registryProvider.getRegistry(world).getRobot(robotTakingId);
        }
    
    return robotTaking;
}