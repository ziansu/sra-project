public void overrideTrajectory() {
    for (int jointIdx = 0; jointIdx < (numberOfJoints); jointIdx++) {
        jointTrajectoryGenerators.get(jointIdx).clear();
        pointQueues.get(jointIdx).clear();
    }
}