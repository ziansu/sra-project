@java.lang.Override
public void Update() {
    android.opengl.Matrix.setIdentityM(localTransformation, 0);
    android.opengl.Matrix.translateM(localTransformation, 0, position[0], position[1], position[2]);
}