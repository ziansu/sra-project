protected void step(int step) {
    gotoScan(((currentScanNo) + step));
    if (((planState) == (RobotInfo.PlanState.PLAN)) || ((planState) == (RobotInfo.PlanState.EXPLORE)))
        setTargetPose(targetPose, planState);
    
}