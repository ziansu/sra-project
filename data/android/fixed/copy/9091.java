public static void step(float stepLength) {
    org.gearvrf.physics.GVRPhysicsWorld.setStepLength(stepLength);
    org.gearvrf.physics.GVRPhysicsWorld.step();
}