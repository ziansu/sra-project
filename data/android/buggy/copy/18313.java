@org.junit.Before
public void setUp() throws java.lang.Exception {
    movementModel = new dmas.model.CollisionAvoidanceModel.Builder().withRoadModel(roadModel).withCollisionRadius(dmas.model.CollisionAvoidanceModelTest.COLLISION_RADIUS).build();
}