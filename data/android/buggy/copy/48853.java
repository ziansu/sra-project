private void drawObjects(actv.ccs.model.graphics.GLAutoDrawable drawable) {
    while (itr.hasNext()) {
        itr.getNext().draw2(drawable, camera[0], null, rndPrograms, pipes, uniShaderLocs);
    } 
}