public void updateFeetPositionsWhenTrustingIMUOnly(us.ihmc.robotics.geometry.FramePoint pelvisPosition) {
    for (us.ihmc.robotics.screwTheory.RigidBody foot : feetRigidBodies)
        updateFootPosition(foot, pelvisPosition);
    
}