@java.lang.Override
protected void jointDependentFeatherstonePassTwo(us.ihmc.euclid.tuple3D.Vector3D w_h) {
    s_hat_i.top.set(u_i);
    s_hat_i.bottom.cross(u_i, d_i);
}