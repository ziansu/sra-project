public void setUniform(java.lang.String uniformName, com.copetti.threeD.opengl.uniform.Uniform uniform) {
    int uniformId = glGetUniformLocation(shaderId, uniformName);
    glEnableVertexAttribArray(uniformId);
    uniform.getType().setUniform(uniformId, uniform.getValue());
}