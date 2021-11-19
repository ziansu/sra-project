@java.lang.Override
public void update() {
    this.physicsEntities = worldContainer.getEntitiesWithComponentType(engine.physics.PhysicsComp.class);
    applyFriction();
    updateVelocities();
    updatePositions();
    resetAcceleration();
}