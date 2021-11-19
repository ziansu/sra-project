private void removeCollider(org.terasology.physics.bullet.btCollisionObject collider) {
    discreteDynamicsWorld.removeCollisionObject(collider);
    collider.getCollisionShape().dispose();
    collider.dispose();
}