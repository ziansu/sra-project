public void mass(float mass) {
    javax.vecmath.Vector3f inertia = new javax.vecmath.Vector3f();
    body.getCollisionShape().calculateLocalInertia(mass, inertia);
    body.setMassProps(mass, inertia);
}