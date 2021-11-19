private void drawTrajectories(com.jogamp.opengl.GL2.GL2 gl2) {
    for (java.util.List<java.awt.Point> oldTrajectory : oldTrajectories) {
        drawTrajectory(gl2, oldTrajectory, 0.5F, 0.5F, 0.5F);
    }
    drawTrajectory(gl2, trajectory, 1.0F, 0.0F, 0.0F);
}