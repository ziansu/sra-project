private void render(com.jogamp.opengl.GLAutoDrawable drawable) {
    for (Object3D object : objects)
        object.render(drawable);
    
}