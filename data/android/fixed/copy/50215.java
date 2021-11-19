public org.joml.Matrix4f getProjection(org.joml.Matrix4f target) {
    target.translate(pos);
    target.scale(scale);
    return target;
}