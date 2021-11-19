public void setTransformPosition(com.badlogic.gdx.math.Vector3 displacement) {
    styleAttribute.transform.position.set(displacement);
    styleAttribute.checkShaderRequirements();
}