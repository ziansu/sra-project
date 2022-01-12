public final int getResult() {
    return glGetQueryObjecti(id(), clientapi.util.render.gl.GL_QUERY_RESULT);
}