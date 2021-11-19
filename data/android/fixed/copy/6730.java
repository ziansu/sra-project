@java.lang.Override
protected void jointDependentSetAndGetRotation(us.ihmc.euclid.matrix.RotationMatrix Rh_i) {
    Rh_i.set(owner.getRigidRotation());
}